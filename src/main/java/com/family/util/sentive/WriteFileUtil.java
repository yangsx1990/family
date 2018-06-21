package com.family.util.sentive;

import java.io.*;

/**
 * @author yangsaixing
 * @description 写文件工具类
 * @date Created in 下午4:51 2017/11/15
 */
public class WriteFileUtil {
    public static void main(String[] args) {
        String txtFile="/Users/yangsaixing/Documents/doc/其他/SensitiveWord3.txt";
        new WriteFileUtil().StringBufferDemo(txtFile);
    }

    /**
     * 使用PrintStream写文件
     * @param path 文件路径
     */
    public void PrintStreamDemo(String path){
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(path);
            PrintStream printStream=new PrintStream(fileOutputStream);
            for (int i=0;i<4;i++){
                printStream.print("this is "+i+"line.");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * 使用StringBuffer写文件
     * @param path 文件路径
     */
    public void StringBufferDemo(String path){
        File file=new File(path);
        try {
            if(!file.exists()) file.createNewFile();
            FileOutputStream fileOutputStream=new FileOutputStream(file,false);
            for (int i=0;i<4;i++){
                StringBuffer stringBuffer=new StringBuffer();
                stringBuffer.append("这是第 "+i+"行数据，之前的不用看了..。。。。"+"\n");
                fileOutputStream.write(stringBuffer.toString().getBytes("utf-8"));
            }
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
