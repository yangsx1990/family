package com.family.util.sentive;

import com.itextpdf.text.BaseColor;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.BaseFont;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/6/2 下午2:28
 * @modified By:
 */
public class PDFWaterMarkUtil {

    public static void main(String[] args) throws IOException, DocumentException, com.itextpdf.text.DocumentException {
        String outputPath="/Users/yangsaixing/Desktop/统一登录接入说明01.pdf";
        String inputPath="/Users/yangsaixing/Desktop/统一登录接入说明.pdf";
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(new File(outputPath)));
        setWaterMark(bufferedOutputStream,inputPath,new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime())+"下载使用人"+"测试user",16);

    }

    public static void setWaterMark(BufferedOutputStream bufferedOutputStream,String input,String markContent,int permission) throws IOException, DocumentException, com.itextpdf.text.DocumentException {
        PdfReader reader=new PdfReader(input);
        PdfStamper stamper=new PdfStamper(reader,bufferedOutputStream);
        int totalPage=reader.getNumberOfPages()+1;
        PdfContentByte content;
        BaseFont base = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.EMBEDDED);

        PdfGState pdfGState=new PdfGState();

        System.out.println("totalPage:"+totalPage);
        //遍历每页，添加水印
        for(int i=1;i<totalPage;i++){
            setMark(i,stamper,pdfGState,base);
        }
        stamper.close();

    }

    private static void setMark(int i, PdfStamper stamper,PdfGState pdfGState,BaseFont base) {
        PdfContentByte content=stamper.getOverContent(i);
        pdfGState.setFillOpacity(0.2f);
        content.beginText();
        content.setColorFill(BaseColor.LIGHT_GRAY);
        content.setFontAndSize(base,50);
        content.setTextMatrix(70, 200);
        content.showTextAligned(Element.ALIGN_CENTER, "公司内部文件，请注意保密！", 300, 350, 55);
        content.endText();

    }
}
