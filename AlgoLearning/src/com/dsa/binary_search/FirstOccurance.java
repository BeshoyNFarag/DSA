/*Exercise 3 — First Occurrence (Important)
Task: Find first position of target in sorted array.
// Input: [1, 2, 2, 2, 3], target = 2
// Output: 1
Hint: Even after finding target, move left.
*/

package com.dsa.binary_search;

public class FirstOccurance {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 2, 3};
        System.out.println(firstOccurencePosition(arr, 1));
    }

    private static int firstOccurencePosition(int [] arr , int target){
        int low = 0;
        int high = arr.length - 1;
        int result = 0;
        while(low <= high){
            int midPosition = (low + high)/2;
            int midValue = arr[midPosition];


            if(midValue == target){
                result = midValue;
                high = midPosition - 1;


            }
            else if(midValue < target){
                low = midPosition + 1;
            }
            else{
                high = midPosition - 1;
            }

        }
        return result;

    }
}
