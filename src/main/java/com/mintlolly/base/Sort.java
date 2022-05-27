package com.mintlolly.base;

/**
 * Created on 2022/5/18
 *
 * @author jiangbo
 * Description:
 */
public class Sort {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 5, 7, 4, 3, 1, 9, 21};
        selectSort(nums);
        System.out.println();
        insertSort(nums);
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                index = nums[j] < nums[index]? j : index;
            }
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
        }
        print(nums);
    }

    public static void insertSort(int[] nums){
        if(nums==null || nums.length <2){
            print(nums);
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j > 0; j--) {
                if(nums[i] < nums[j]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        print(nums);
    }

    public static void print(int[] nums){
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }
}
