package org.example;

public class FirstLastPosition {

    public int[] searchRange(int[] nums, int target) {
        int [] returnArray = new int[]{-1,-1};
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if (target == nums[i]){
                returnArray[count++] = i;
            }
        }
        return returnArray;
    }

    public static void main(String[] args) {
        FirstLastPosition firstLastPosition = new FirstLastPosition();
        int [] arrayReturned = firstLastPosition.searchRange(new int[]{5,7,7,8,8,10}, 6);
        for(int i=0; i<2; i++){
            System.out.print(arrayReturned[i]);
        }

    }
}
