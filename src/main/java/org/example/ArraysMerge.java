package org.example;

import java.util.Arrays;

public class ArraysMerge {

    public static void merge(int[] nums1, int[] nums2) {
        int [] mergedArray = new int[nums1.length + nums2.length];

        for(int i=0; i<nums1.length; i++){
            mergedArray[i] = nums1[i];
        }
        int j=0;
        int lengthOfFirstArray = nums1.length-1;
        while (j<nums2.length){
            mergedArray[lengthOfFirstArray + 1] = nums2[j++];
            lengthOfFirstArray ++;
        }

        Arrays.stream(mergedArray).forEach(System.out::println);

    }

    public static void sameArrayMerge(int[] nums1, int[] nums2) {

    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, new int[]{2,5,6});
    }
}
