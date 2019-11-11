package com.family.util.sentive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:47 2019/7/19
 */
public class HttpUtils {

    public static String doGet(String requestUrl){
        InputStream inputStream=null;
        BufferedReader bufferedReader=null;
        HttpURLConnection urlConnection=null;
        try {
            URL url=new URL(requestUrl);
            urlConnection =(HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(15000);
            urlConnection.connect();
            if(urlConnection.getResponseCode()==200){
                inputStream = urlConnection.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

                StringBuffer stringBuffer=new StringBuffer();
                String temp=null;
                while((temp= bufferedReader.readLine())!=null){
                    stringBuffer.append(temp);
                    stringBuffer.append("\r\n");
                }
                return stringBuffer.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            urlConnection.disconnect();
        }
        return "";
    }


    public static void main(String[] args) {
        String url="http://localhost:8081/consultant/student?studentNo=15201";
        String result=doGet(url);
        System.out.println(result);
        /*try{
            Integer i=0;
            return;
            System.out.println("return");
        }catch (Exception e){

        }finally {
            System.out.println("finally");
        }
        System.out.println("end");*/

    }
}
