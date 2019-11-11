package com.family.leetcode;
/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:20 2019/7/10
 */
public class ToLowerCase {
    public void convert(String str){

        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            byte byteValue=(byte)str.charAt(i);
            if(byteValue>=65 && byteValue<=90){
                chars[i]=(char)(byteValue+32);
            }
        }
        System.out.println(new String(chars));
    }

    public static void main(String[] args) {
        ToLowerCase toLowerCase=new ToLowerCase();
        toLowerCase.convert("HAPPY BIRTHDAY");
        String str="aZ";
        str.toLowerCase();
    }

    private char[] StringtoChar(String str){
        return str.toCharArray();
    }

    public String charToString(char[] chars){
        return new String(chars);
    }

    public byte charToByte(char charValue){
        return (byte)charValue;
    }

    public char byteToChar(byte byteValue){
        return (char) byteValue;
    }



}
