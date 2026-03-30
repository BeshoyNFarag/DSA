package com.dsa.linear_search;/*Exercise 7 — Find All Indices of Target
Task: Return all positions of a target.
// Input: [1, 2, 3, 2, 4], target = 2
// Output: [1, 3]
*/


import java.util.ArrayList;

public class LinearFindAll {

    public static ArrayList<Integer> findIndices(int [] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                list.add(i);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 2, 4};
        System.out.println(findIndices(arr, 2));
    }
}
