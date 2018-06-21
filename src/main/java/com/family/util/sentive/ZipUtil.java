package com.family.util.sentive;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author yangsaixing
 * @description 压缩工具类
 * @date Created in 下午4:27 2018/6/21
 */
public class ZipUtil {


    public static void readZipFile() throws IOException {

        String filePath="/Users/yangsaixing/Desktop/归档.zip";

        BufferedOutputStream dest=null;

        //新建读取zip流
        ZipInputStream zip = new ZipInputStream(new FileInputStream(filePath));

        BufferedReader buf = new BufferedReader(new InputStreamReader(zip));

        //此类用于表示 ZIP 文件条目
        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            System.out.println("文件名称："+entry.getName());

            String str;
            while ((str = buf.readLine()) != null)
                System.out.println(str + "\n");

            //把读取到的内容输出到文件中
            //关闭当前 ZIP条目并定位流以读取下一个条目
            zip.closeEntry();
        }
        //流关闭
        buf.close();
        zip.close();
    }


    public static  void readZipfileAndWrite(){
        Integer BUFFER=2048;
        try {
            BufferedOutputStream dest = null;
            FileInputStream fis = new
                    FileInputStream("/Users/yangsaixing/Desktop/归档.zip");
            ZipInputStream zis = new
                    ZipInputStream(new BufferedInputStream(fis));
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("Extracting: " + entry);
                if(entry.getName().equals("归档/文签导数据-2017年9月1日.txt")){
                    int count;
                    byte data[] = new byte[BUFFER];
// write the files to the disk
                    FileOutputStream fos = new
                            FileOutputStream("/Users/yangsaixing/Documents/project/test_import/"+"test.txt");
                    dest = new
                            BufferedOutputStream(fos, BUFFER);
                    while ((count = zis.read(data, 0, BUFFER))
                            != -1) {
                        dest.write(data, 0, count);
                    }
                    dest.flush();
                    dest.close();
                }

            }
            zis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
