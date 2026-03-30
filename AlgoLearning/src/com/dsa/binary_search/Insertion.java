/*Exercise 6 — Find Insert Position (LeetCode classic)
Task: Where should element be inserted?
// Input: [1, 3, 5, 6], target = 2
// Output: 1
*/
package com.dsa.binary_search;

public class Insertion {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 6};
        System.out.println(position(arr, 7));
    }

    public static int position(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low;
    }
}
