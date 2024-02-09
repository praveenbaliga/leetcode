package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxValueHashMap
{
    public static void main(String[] args)
    {
        Map<String,Integer> coursePrice = new HashMap<>();
        coursePrice.put("Java",5000);
        coursePrice.put("Python",3000);
        coursePrice.put("CPP",4000);
        coursePrice.put("Android",8000);
        System.out.println("maximum price is : "+ Collections.max(coursePrice.values()));
    }
}
