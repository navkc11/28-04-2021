package com.company;

import java.util.Arrays;

public class Ex1 {
    public static void main() {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {9,8,7,4,2,5,8,4,1,5};
        func(arr1,arr2);
    }
    public static void func(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length|| i < arr2.length; i++) {
            try {


                System.out.println(Math.max(arr1[i], arr2[i]));
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(Arrays.toString(arr2));
                break;
            }
        }
    }

}
