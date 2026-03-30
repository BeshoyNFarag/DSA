/*Exercise 1 — Basic Binary Search
Task: Return index of target.
// Input: [1, 3, 5, 7, 9], target = 7
// Output: 3
*/

package com.dsa.binary_search;
public class BasicBinarySearch {
    public static int indexOfTarget(int [] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int middlePosition = (low + high)/2;
            int middleValue = arr[middlePosition];
            if(target == middleValue){
                return middlePosition - 1;
            }
            if (target < middleValue){
                high = middlePosition - 1;
            }
            else{
                low = middlePosition + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 7, 9};
        System.out.println(indexOfTarget(arr, 9));


    }

}
