package org.example;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "HHello";
        boolean flag = false;
        char firstChar = 0;
        List<Character> characterList = new ArrayList<>();
        for(int i=0; i<str.length(); i++){

            for(int j=i+1; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)) {
                    characterList.add(str.charAt(i));
                    break;
                }else{
                    if(j==str.length()-1 && !characterList.contains(str.charAt(i))) {
                        firstChar = str.charAt(i);
                        flag = true;
                        break;
                    }
                }

            }

            if (flag) {
                System.out.println(i);
                break;
            }

        }
        System.out.println(firstChar);
    }
}
