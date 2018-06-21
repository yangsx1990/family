package com.family.util.sentive;

import java.io.File;
import java.io.IOException;

/**
 * @author yangsaixing
 * @description 文件操作工具类，提供文件重命名、移动文件等操作
 * @date Created in 下午5:13 2017/11/15
 */
public class FileUtil {


    /**
     * 重命名文件
     * @param path 路径
     * @param oldname 原文件名称
     * @param newname 现文件名称
     */
    public void renameFile(String path,String oldname,String newname){
        if(!oldname.equals(newname)){//新的文件名和以前文件名不同时,才有必要进行重命名
            File oldfile=new File(path+"/"+oldname);
            File newfile=new File(path+"/"+newname);
            if(newfile.exists())//若在该目录下已经有一个文件和新文件名相同，则不允许重命名
                System.out.println(newname+"已经存在！");
            else{
                oldfile.renameTo(newfile);
            }
        }
    }

    /**
     * 转移文件目录
     * @param filename 文件名称
     * @param oldpath 原路径
     * @param newpath 新路径
     * @param cover 是否覆盖文件
     */
    public void changeDirectory(String filename,String oldpath,String newpath,boolean cover){
        if(!oldpath.equals(newpath)){
            File oldfile=new File(oldpath+"/"+filename);
            File newfile=new File(newpath+"/"+filename);
            if(newfile.exists()){//若在待转移目录下，已经存在待转移文件
                if(cover)//覆盖
                    oldfile.renameTo(newfile);
                else
                    System.out.println("在新目录下已经存在："+filename);
            }
             else{
                oldfile.renameTo(newfile);
            }
        }
    }

    /**
     * 创建新文件
     * @param path
     */
    public void createDir(String path){
        File dir=new File(path);
        if(!dir.exists())
            dir.mkdir();
    }

    /**
     * 创建新文件
     * @param path
     * @param filename
     * @throws IOException
     */
    public void createFile(String path,String filename) throws IOException {
        File file=new File(path+"/"+filename);
        if(!file.exists())
            file.createNewFile();
    }

    /**
     * 删除文件
     */
    public void delFile(String path,String filename){
        File file=new File(path+"/"+filename);
        if(file.exists()&&file.isFile())
            file.delete();
    }

    /**
     * 删除目录
     * 备注：要利用File类的delete()方法删除目录时，必须保证该目录下没有文件或者子目录，否则删除失败。
     * 因此在实际应用中，我们要删除目录，必须利用递归删除该目录下的所有子目录和文件，然后再删除该目录。
     * @return
     */
    public void delDir(String path){
        File dir=new File(path);
        if(dir.exists()){
            File[] tmp=dir.listFiles();
            for(int i=0;i<tmp.length;i++){
                if(tmp[i].isDirectory()){
                    delDir(path+"/"+tmp[i].getName());
                }else{
                    tmp[i].delete();
                }
            }
            dir.delete();
        }
    }
}
