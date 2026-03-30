/*Exercise 5 — Count Occurrences
Use:
count = lastIndex - firstIndex + 1
*/
package com.dsa.binary_search;
public class CountOccurence {


    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 2, 3};
        System.out.println(count(arr, 2));
    }

    public static int count(int [] arr , int target){
        int low = 0;
        int high = arr.length - 1;
        int count = 0;

        // left search
        while(low <= high){
            int midPosition = (low + high) /2;
            int midValue = arr[midPosition];
            if(midValue == target){
                count += 1;
                high = midPosition - 1;
            }
            else if(midValue < target){
                low = midPosition + 1;
            }
            else
                high = midPosition - 1;
        }
        low = 0;
        high = arr.length - 1;
        while(low <= high){
            int midPosition = (low + high) /2;
            int midValue = arr[midPosition];
            if(midValue == target){
                count += 1;
                low  = midPosition + 1;
            }
            else if(midValue < target){
                low = midPosition + 1;
            }
            else
                high = midPosition - 1;
        }

        return count - 1 ;

    }

}
