package org.example;

public class UniqueChars
{

public static boolean unique(String str){
    boolean flag = false;
    int [] intArray = new int[128];
    char ch;
    int val;
    for (int j=0; j<str.length(); j++){
        ch = str.charAt(j);
        val = 'z' - ch;

        if (intArray[val]==1){
            return flag;
        }else{
            intArray[val]=1;
        }
    }
    return !flag;
}
    public static void main(String[] args)
    {
       String[] str = new String[]{"strings","javs"};

       for (int i=0; i<str.length; i++){
           System.out.println(unique(str[i]));
       }
    }
}