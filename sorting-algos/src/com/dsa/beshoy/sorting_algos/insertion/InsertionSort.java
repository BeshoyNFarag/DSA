package com.dsa.beshoy.sorting_algos.insertion;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] arr = {2,4,5,6,2,87,41,78,32};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void insertionSort(int [] arr){
        int temp = 0;
        int size = arr.length;

        for(int i = 1; i < size; i++){
            int j = i - 1;
            temp = arr[i];

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; // shift right
                j--;
            }
            arr[j + 1] = temp;


        }


    }
}
