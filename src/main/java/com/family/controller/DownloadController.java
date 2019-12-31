package com.family.controller;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @author yangsaixing
 * @description 下载控制器
 * @date Created in 上午10:26 2017/11/7
 */
@Controller
public class DownloadController {

    private String path="/Users/yangsaixing/Documents/HR/澳际集团岗位说明书-前端工程师.pdf";

    private String urlPath="http://www.oohdear.com/init/";

    private String urlPic="_20170727180406269.jpg";

    @RequestMapping(value="download")
    public void download(HttpServletRequest request, HttpServletResponse response){
        try {
            // path是指欲下载的文件的路径。
            File file = new File(path);
            // 取得文件名。
            String filename = file.getName();
            // 取得文件的后缀名。
            String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();

            // 以流的形式下载文件。
            InputStream fis = new BufferedInputStream(new FileInputStream(path));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes("utf-8")));
            response.addHeader("Content-Length", "" + file.length());
            ServletOutputStream out= response.getOutputStream();
            //byte[] bufferout = new byte[512]; // 缓冲区
            /*int bytesToRead = -1;
            // 通过循环将读入的Excel文件的内容输出到浏览器中
            while ((bytesToRead = fis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesToRead);
            }
            out.flush();
            if (fis != null) {
                fis.close();
            }*/
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
            //二进制流，不清楚文件类型。
            response.setContentType("application/octet-stream;charset=utf-8");
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //return response;
    }

    @RequestMapping("/downloadlocal")
    public void downloadLocal(HttpServletResponse response) throws FileNotFoundException {
        // 下载本地文件
        String fileName = "你好.pdf".toString(); // 文件的默认保存名
        // 读到流中
        InputStream inStream = new FileInputStream(path);// 文件的存放路径
        // 设置输出的格式
        response.reset();
        response.setCharacterEncoding("utf-8");
        response.setContentType("bin");
        response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("downloadnet")
    public void downloadNet(HttpServletResponse response) throws MalformedURLException {
        // 下载网络文件
        int bytesum = 0;
        int byteread = 0;

        URL url = new URL(urlPath+urlPic);
        String ext = urlPic.substring(urlPic.lastIndexOf(".") + 1).toUpperCase();
        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            File file=new File("/Users/yangsaixing/Documents/abc"+ext);
            response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment; filename=\"" + urlPic + "\"");
            FileOutputStream fs = new FileOutputStream(file);
            ServletOutputStream out=response.getOutputStream();
//
//            byte[] buffer = new byte[1204];
//            while ((byteread = inStream.read(buffer)) != -1) {
//                bytesum += byteread;
//                fs.write(buffer, 0, byteread);
//            }
//
//            File file=new File("/Users/yangsaixing/Documents/abc.gif");
//            InputStream inputStream=new FileInputStream(file);
            byte[] bufferout = new byte[512]; // 缓冲区
            int bytesToRead = -1;
            // 通过循环将读入的Excel文件的内容输出到浏览器中
            while ((bytesToRead = inStream.read(bufferout)) != -1) {
                out.write(bufferout, 0, bytesToRead);
            }
            out.flush();
            if (inStream != null) {
                inStream.close();
            }
            file.delete();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/download/local/preview")
    public void downloadPreview( HttpServletResponse response, boolean isOnLine) throws Exception {
        File f = new File(path);
        if (!f.exists()) {
            response.sendError(404, "File not found!");
            return;
        }
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
        byte[] buf = new byte[1024];
        int len = 0;

        response.reset(); // 非常重要
        if (isOnLine) { // 在线打开方式
            URL u = new URL("file:///" + path);
            response.setContentType(u.openConnection().getContentType());
            response.setHeader("Content-Disposition", "inline; filename=" + f.getName());
            // 文件名应该编码成UTF-8
        } else { // 纯下载方式
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment; filename=" + f.getName());
        }
        OutputStream out = response.getOutputStream();
        while ((len = br.read(buf)) > 0)
            out.write(buf, 0, len);
        br.close();
        out.close();
    }
/*
    @RequestMapping("/download/net/preview")
    public void downloadNetPreview( HttpServletResponse response, boolean isOnLine) throws Exception {
        URL url = new URL(urlPath+urlPic);
        String ext = urlPic.substring(urlPic.lastIndexOf(".") + 1);
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            File file=new File("/Users/yangsaixing/Documents/abc."+ext);
        FileOutputStream fs = new FileOutputStream(file);
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(file));
        byte[] buf = new byte[1024];
        int len = 0;

        response.reset(); // 非常重要
        if (isOnLine) { // 在线打开方式
            URL u = new URL("file:///" + path);
            response.setContentType(u.openConnection().getContentType());
            response.setHeader("Content-Disposition", "inline; filename=" + file.getName());
            // 文件名应该编码成UTF-8
        } else { // 纯下载方式
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
        }
        OutputStream out = response.getOutputStream();
        while ((len = br.read(buf)) > 0)
            out.write(buf, 0, len);
        br.close();
        out.close();
    }*/

    @RequestMapping("export/demo")
    public String getExportPage(){
        return "export";
    }

    @RequestMapping(value = "export/excel/demo",method = RequestMethod.POST)
    public void export(HttpServletRequest request,String name,HttpServletResponse response) throws IOException {
      /*  System.out.println(request.getContentType());
        // 下载网络文件
        int bytesum = 0;
        int byteread = 0;


        try {
            URL url = new URL(urlPath+urlPic);
            String ext = urlPic.substring(urlPic.lastIndexOf(".") + 1).toUpperCase();
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            File file=new File("/Users/yangsaixing/Documents/abc"+ext);
            response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment; filename=\"" + urlPic + "\"");
            FileOutputStream fs = new FileOutputStream(file);
            ServletOutputStream out=response.getOutputStream();
//
//            byte[] buffer = new byte[1204];
//            while ((byteread = inStream.read(buffer)) != -1) {
//                bytesum += byteread;
//                fs.write(buffer, 0, byteread);
//            }
//
//            File file=new File("/Users/yangsaixing/Documents/abc.gif");
//            InputStream inputStream=new FileInputStream(file);
            byte[] bufferout = new byte[512]; // 缓冲区
            int bytesToRead = -1;
            // 通过循环将读入的Excel文件的内容输出到浏览器中
            while ((bytesToRead = inStream.read(bufferout)) != -1) {
                out.write(bufferout, 0, bytesToRead);
            }
            out.flush();
            if (inStream != null) {
                inStream.close();
            }
            file.delete();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-disposition","attachment;filename=" + URLEncoder.encode("优惠券导出"+ ".xls", "UTF-8"));
        ServletOutputStream out = response.getOutputStream();
        BufferedOutputStream buffOut = null;

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("优惠券数据");
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("优惠券码");
        row.createCell(1).setCellValue("生成批次");
        buffOut = new BufferedOutputStream(out);
        wb.write(buffOut);
    }
}
