package org.example;

import java.util.Map;
import java.util.TreeMap;

public class SingleElement {

    public int singleNumber(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int single = 0;

        for(int i=0; i<nums.length; i++){
            if (treeMap.containsKey(nums[i])){
                treeMap.put(nums[i],treeMap.get(nums[i])+1);
            }else{
                treeMap.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){
            if (entry.getValue()==1){
                single = entry.getKey();
            }
        }
        return single;
    }
    public static void main(String[] args) {
        SingleElement singleElement = new SingleElement();
        System.out.println(singleElement.singleNumber(new int[] {4,1,2,1,2}));
    }
}
