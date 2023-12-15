package org.example;

public class RemoveArrayElement {

//    public int removeElement(int[] nums, int val) {
//        int k=0;
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]==val){
//                nums[i] = 0;
//                k++;
//            }
//        }
//        for(int i=0; i<nums.length; i++){
//            System.out.println(nums[i]);
//        }
//        return nums.length - k;
//    }

    public int removeElement(int[] nums, int val) {
        int k = 0; // Represents the count of elements not equal to val

        // Use two pointers: one to iterate through the array and another to place non-val elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place non-val elements at position k
                k++; // Increment k for every non-val element found
            }
        }
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        return k; // Return the count of elements not equal to val
    }

    public static void main(String[] args) {
        RemoveArrayElement removeArrayElement = new RemoveArrayElement();
        System.out.println("The ... " + removeArrayElement.removeElement(new int[]{3,2,2,3}, 3));
    }
}
