package com.family.util.sentive;

import java.io.*;

/**
 * @author yangsaixing
 * @description 读取文件工具类
 * @date Created in 下午3:06 2017/11/14
 */
public class ReadFileUtil {


    public static void main(String[] args) {
        String txtFile="/Users/yangsaixing/Documents/doc/其他/SensitiveWord.txt";
        new ReadFileUtil().readByBuffer(txtFile);

    }

    /**
     * 使用BufferedReader读取字符
     */
    public void readByBuffer(String filePath){
        //读取文件
        File file = new File(filePath);
        try {
            InputStreamReader read = new InputStreamReader(new FileInputStream(file), "utf-8");
            if(file.isFile() && file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(read);
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    System.out.println("输出字符：" + str);
                }
            }
            read.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /***
     * 使用InputStream读取字符
     */
    public void readByInputStream(String filePath){
        try{
            File file = new File(filePath);    //读取文件
            if(file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), "utf-8");
                byte[] out = new byte[512];
                InputStream inputStream = new FileInputStream(file);
                int len = 0;
                int temp = 0;          //所有读取的内容都使用temp接收
                while ((temp = inputStream.read()) != -1) {    //当没有读取完时，继续读取
                    out[len] = (byte) temp;
                    len++;
                }
                inputStream.close();
                System.out.println(new String(out, 0, len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /***
     * 使用InputStreamReader读取字节，废弃
     */
    public void readByInputStreamReader(String filePath){
        try {
            //读取文件
            File file = new File(filePath);
            InputStreamReader read = new InputStreamReader(new FileInputStream(file),"utf-8");
            byte[] out=new byte[512];
            int c=-1;
           while ((c=read.read())!=-1){
               System.out.println("输出字节："+c);
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
