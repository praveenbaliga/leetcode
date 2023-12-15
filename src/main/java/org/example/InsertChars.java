package org.example;

public class InsertChars
{
    public static String insertChar(String str1, char chr)
    {
        String inserted="", left="", right="", result = str1;
        result = chr + str1;
        for(int i=0;i<str1.length(); i++)
        {
            left = str1.substring(0,i+1);
            right = str1.substring(i+1);
            inserted = left + chr + right;
        }
        result = result + " " + inserted;
        return result;
    }
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "def";
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        String newStr="", insertions = "";
        for(int i=0; i<str2.length(); i++)
        {
            newStr = insertChar(str1, str2.charAt(i));
            insertions = insertions+ " " + newStr;
        }
        System.out.println("result:"+insertions);
    }
}
