package com.mintlolly.base;

import java.util.Arrays;
import java.util.Random;

/**
 * Created on 2022/5/20
 *
 * @author jiangbo
 * Description:
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int numLen = (int) (Math.random() * 20);

            int[] test = new int[numLen];
            for (int i = 0; i < numLen; i++) {
                test[i] = (int) (Math.random() * 100);
            }
            Arrays.sort(test);
            int num = (int) (Math.random() * 100);
            flag = (binarySearch(test, num) == search(test, num));
            if(!flag){
                for (int i = 0; i < numLen; i++) {
                    System.out.print(test[i]);
                }
            }
        }
    }

    public static boolean binarySearch(int[] arr, int num) {
        int L = 0;
        int R = arr.length-1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return false;
    }

    public static boolean search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
