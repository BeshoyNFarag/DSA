/*Exercise 4 — Last Occurrence
// Input: [1, 2, 2, 2, 3]
// Output: 3
*/

package com.dsa.binary_search;

public class LastOccurence {

    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3};
        System.out.println(lastOccurence(arr,2));
    }

    private static int lastOccurence(int [] arr, int target){
        int low = 0 ;
        int high = arr.length - 1;
        int result = -2000;
        while(low <= high){
            int midPosition = (low + high)/2;
            int midValue = arr[midPosition];
            if(midValue == target){
                result = midPosition;
                low = midPosition + 1;
            }
            else if(midValue > target){
                high = midPosition - 1;
            }
            else{
                low = midPosition + 1;
            }

        }

        return result;

    }
}
