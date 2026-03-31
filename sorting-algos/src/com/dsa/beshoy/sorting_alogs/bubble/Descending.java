/*6. Challenge Problems
Exercise 6.1 – Descending Order
Modify Bubble Sort to sort in descending order
Exercise 6.2 – Count Operations
Add counters to track:
Number of comparisons
Number of swaps
Exercise 6.3 – Partial Sorting Insight
Given:
[2, 1, 3, 4, 5]
How many passes are needed with optimization?
Why?*/


package com.dsa.beshoy.sorting_alogs.bubble;

public class Descending {

    public static void main(String[] args) {

        int [] arr = {1,4,25,23,26,34,2};
        descendingBubbleSort(arr);


    }

    public static void descendingBubbleSort(int [] arr){
            int temp = 0;
            int count = 0;
            int passes = 0;
            int comparisons = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                boolean flag = false;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    comparisons ++;
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = true;
                        count++;
                    }

                }

                if (!flag) {
                    break;
                }
                passes++;

            }
            for (int num: arr){
                System.out.print(num + " ");
            }
        System.out.println("\nnumber of swaps: " + count);
        System.out.println("number of passes: " + passes);
        System.out.println("number of comparisons: " + comparisons);



    }
}

