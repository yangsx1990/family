package com.family.util.sentive;

import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/6/1 下午2:42
 * @modified By:
 */
public class WaterMarkUtils {
    public static int FONT_SIZE=200;

    public static String MARK_WORDS="测试";

    // 水印之间的间隔
    private static final int XMOVE = 80;
    // 水印之间的间隔
    private static final int YMOVE = 80;

    // 水印透明度
    private static float alpha = 0.5f;

    // 水印旋转度数
    private static final int DEGREE = 50;

    private static String content="测试";

    private static Color RED=Color.RED;

    public static void main(String[] args) {



        String srcPath="/Users/yangsaixing/Desktop/个人海报.png";
        String outPath="/Users/yangsaixing/Desktop/test.jpeg";

        String urlPath="http://ks3-cn-beijing.ksyun.com/aojixiaoxi/studentClient/studentHeadPortrait/2020/08/15/1597470909070059885.png";
        String iconPath="/Users/yangsaixing/Desktop/icon1.jpg";

        //new WaterMarkUtils().wordMarkForImg(srcPath,outPath);
        new WaterMarkUtils().imgMarkForImg(srcPath,outPath,urlPath);
      /*  BufferedImage bufferedImage=new BufferedImage(500,300,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        Image image= null;
        try {
            image = new WaterMarkUtils().readImg(srcPath);
            graphics.drawImage(image,0,0,500,300,null);
            graphics.dispose();

            //输出图片
            FileOutputStream outputStream=new FileOutputStream(outPath);
            ImageIO.write(bufferedImage,"jpeg",outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    private String getIconPath(String urlPath){
        URL url = null;
        try {
            url = new URL(urlPath);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String ext = urlPath.substring(urlPath.lastIndexOf(".") + 1).toUpperCase();
        URLConnection conn = null;
        try {
            conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file=new File( ClassUtils.getDefaultClassLoader().getResource("").getPath()+"temp."+ext);
        return file.getPath();
    }

    /**
     * 给图片添加文字水印
     * @param srcImg
     * @param outImg
     */
    public void wordMarkForImg(String srcImg, String outImg){

        try {
            //读取原始图片，并设置画笔对象
            Image image= readImg(srcImg);
            int srcImgWidth=image.getWidth(null);
            int srcImgHeight=image.getHeight(null);
            BufferedImage bufferedImage=new BufferedImage(srcImgWidth,srcImgHeight,BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics=drawImg(image,bufferedImage,srcImgWidth,srcImgHeight,null);


            //设置水印位置
            setMarkLocation(srcImgWidth,srcImgHeight,graphics);

            graphics.dispose();

            //输出图片
            FileOutputStream outputStream=new FileOutputStream(outImg);
            ImageIO.write(bufferedImage,"jpeg",outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 给图片添加图片水印
     * @param srcImg
     * @param outImg
     */
    public void imgMarkForImg(String srcImg, String outImg,String iconPath){
        try {
            //读取原始图片，并设置画笔对象
            Image image= readImg(srcImg);
            int srcImgWidth=image.getWidth(null);
            int srcImgHeight=image.getHeight(null);
            BufferedImage bufferedImage=new BufferedImage(srcImgWidth,srcImgHeight,BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics=drawImg(image,bufferedImage,srcImgWidth,srcImgHeight,iconPath);


            //设置水印位置
            //setMarkLocation(srcImgWidth,srcImgHeight,graphics);

            graphics.dispose();

            //输出图片
            FileOutputStream outputStream=new FileOutputStream(outImg);
            ImageIO.write(bufferedImage,"jpeg",outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private Graphics2D drawImg(Image image,BufferedImage bufferedImage,int srcImgWidth,int srcImgHeight,String iconPath) throws MalformedURLException {
        //加水印
        Graphics2D graphics = bufferedImage.createGraphics();
        graphics.drawImage(image,0,0,srcImgWidth,srcImgHeight,null);
        Font font=new Font("宋体",Font.PLAIN,FONT_SIZE);
        graphics.setColor(RED);
        graphics.setFont(font);
        if(DEGREE!=0){
            //设置水印旋转
            //graphics.rotate(Math.toRadians(DEGREE),(double)bufferedImage.getWidth()/2,(double)bufferedImage.getHeight()/2);
        }

        //水印透明度
        //graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,alpha));
        if(StringUtils.hasText(iconPath)){
            ImageIcon imageIcon=new ImageIcon(new URL(iconPath));
            Image iconImage=imageIcon.getImage();
           /* Image iconImage= null;
            try {
                iconImage = ImageIO.read(new File(iconPath));
            } catch (IOException e) {
                e.printStackTrace();
            }*/

            graphics.drawImage(iconImage,160,1150,null);
            System.out.println("src height:"+srcImgHeight+" icon height:"+imageIcon.getIconHeight());
            System.out.println("src width:"+srcImgWidth+" icon width:"+imageIcon.getIconWidth());
            //设置在图片右下角
            //graphics.drawImage(iconImage,(srcImgWidth-imageIcon.getIconWidth()),(srcImgHeight-imageIcon.getIconHeight()),null);
            graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
        }
        return graphics;
    }

    private Image readImg(String srcImg) throws IOException {
        File srcImgFile=new File(srcImg);
        return ImageIO.read(srcImgFile);
    }

    private void setMarkLocation(int srcImgWidth, int srcImgHeight, Graphics2D graphics) {
        int x=-srcImgWidth/2;
        int y=srcImgHeight/2;
        int markWidth=FONT_SIZE*getTextLength(content);
        int markHeight=FONT_SIZE;

        while(x<srcImgWidth*1.5){
            y = -srcImgHeight / 2;
            while (y < srcImgHeight * 1.5) {
                graphics.drawString (MARK_WORDS, x, y);

                y += markHeight + YMOVE;
            }
            x += markWidth + XMOVE;
        }
    }

    /**
     * 获取水印总长度
     * @param markContent 水印内容
     * @param graphics
     * @return
     */
    private int getWatermarkLength(String markContent, Graphics2D graphics) {
        return graphics.getFontMetrics(graphics.getFont()).charsWidth(markContent.toCharArray(),0,markContent.length());
    }

    /**
     * 获取文本长度。汉字为1:1，英文和数字为2:1
     */
    private static int getTextLength (String text) {
        int length = text.length ();
        for (int i = 0; i < text.length (); i++) {
            String s = String.valueOf (text.charAt (i));
            if (s.getBytes ().length > 1) {
                length++;
            }
        }
        length = length % 2 == 0 ? length / 2 : length / 2 + 1;
        return length;
    }
}
