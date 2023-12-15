package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDupes {

public void dupes(){
    int [] array = new int[]{1,2,3,4,2,6,2};

    for (int i=0; i< array.length; i++){
        for (int j=i+1; j< array.length; j++){
            if (array[i]==array[j]){
                array[j]=0;
            }
        }
    }
    Arrays.stream(array).forEach(System.out::println);
}

public void dupechars(){
    String array = "Praveen";

    HashMap<Character, Integer> charsMap = new HashMap<>();
    int count = 1;
    for(int i=0; i<array.length(); i++){
        if(charsMap.containsKey(array.charAt(i))){
            charsMap.put(array.charAt(i),count+1);
        }else{
            charsMap.put(array.charAt(i),1);
        }
    }
    for(Map.Entry<Character, Integer> entry: charsMap.entrySet()){

        if (entry.getValue() > 1){
            System.out.println(entry.getKey());
        }
    }
}

    public void dupecharsSeq(){
        String array = "Praveen Naveen";
        String temp = "";
        int ptr1 =0, ptr2 =1;
        int counter = 0;
        while (counter < array.length() && ptr2 < array.length()){
            if(array.charAt(ptr1)==array.charAt(ptr2)){
                temp = temp + array.charAt(ptr1) + array.charAt(ptr2);
            }else{
                System.out.println(temp.length());
                temp = " ";
            }
            counter++;
            ptr1++;
            ptr2++;

        }


    }

public static void main(String[] args) {
    RemoveDupes removeDupes = new RemoveDupes();
    removeDupes.dupecharsSeq();
}
}
