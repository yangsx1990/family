package com.family.base.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/6/4 上午11:22
 * @modified By:
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        String inputPath="/Users/yangsaixing/Desktop/统一登录接入说明.pdf";
        String inputTxt="/Users/yangsaixing/Desktop/运营活动.txt";
        String pdfPath="/Users/yangsaixing/Desktop/a.pdf";
        //read(inputTxt,100);
        randomWrite(pdfPath);
        System.out.println("操作完成");
        read(pdfPath,100);
    }

    public static void read(String filePath,int pointer) throws IOException {
        RandomAccessFile randomAccessFile=new RandomAccessFile(filePath,"r");
        System.out.println("初始位置："+randomAccessFile.getFilePointer());
        randomAccessFile.seek(pointer);
        byte[] bytes=new byte[1024];
        int hasRead=0;
        while((hasRead= randomAccessFile.read(bytes))>0){
            System.out.println("读取文件内容："+new String(bytes,0,hasRead));
        }
        randomAccessFile.close();
    }

    public static void randomWrite(String path){
        try {
            RandomAccessFile raf = new RandomAccessFile(path,"rw");
            raf.seek(raf.length());
            raf.write("这是新增的内容".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
