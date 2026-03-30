package com.dsa.linear_search;/*Exercise 4 — Find Maximum Element
Task: Use linear traversal to find max.
// Input: [7, 2, 9, 4]
// Output: 9*/


public class LinearMax {

    public static int findMax(int [] arr){
        int max = arr [0];
        for(int num: arr){
            if(num >= max){
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {7, 2, 9, 4};
        System.out.println(findMax(arr));

    }
}

