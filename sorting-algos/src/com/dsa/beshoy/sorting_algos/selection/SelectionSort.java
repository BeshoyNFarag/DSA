package com.dsa.beshoy.sorting_algos.selection;

import java.util.Arrays;



public class SelectionSort {

   public static void main(String[] args) {
       int [] arr = {2,4,5,6,3,2,78,45,23,523,634};
       selectionSort(arr);
       System.out.println(Arrays.toString(arr));

   }

   public static void selectionSort(int[] arr) {
       int minIndex = 0;
       int temp;
       int size = arr.length;
       int steps= 0;

       for(int i = 0; i < size - 1 ; i++) {
           minIndex = i;
           for(int j =  i + 1; j < size ; j++) {
               if(arr[j] < arr[minIndex]) {
                   minIndex = j;
                   steps ++;
               }
           }
           swap(arr, i, minIndex);


       }

       System.out.println(steps);



   }
    public static void swap (int [] arr, int i, int minIndex){
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }
}
