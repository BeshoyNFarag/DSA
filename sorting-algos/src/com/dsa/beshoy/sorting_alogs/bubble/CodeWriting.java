/*2. Code Writing (Core Implementation)
Exercise 2.1
Write a Java method to sort an array using Bubble Sort:
public static void bubbleSort(int[] arr)
Requirements:
Use nested loops
Perform swaps correctly
Exercise 2.2
Modify your code to:
Print the array after each pass
Example output:
Pass 1: ...
Pass 2: ...

Exercise 4.1
Add a swapped flag to your implementation:
Stop the algorithm early if no swaps occur
Exercise 4.2
Test your optimized version with:
[1, 2, 3, 5, 4]
How many passes does it take?
Compare with the non-optimized version

5. Edge Cases
Exercise 5.1
Test your code with:
Empty array []
Single element [10]
All equal elements [5, 5, 5, 5]
What happens in each case?


*/
package com.dsa.beshoy.sorting_alogs.bubble;

public class CodeWriting {


    public static void main(String[] args) {

        int [] arr = {5,5,5,5,5};
        bubbleSort(arr);

    }

    public static void bubbleSort(int [] arr){
        int temp = 0;


        for(int i = 0; i < arr.length -1; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;

                }

            }
            for(int num: arr){
                System.out.print(num + " ");
            }
            System.out.println();
            if(!flag){
                break;
            }

        }

    }
}
