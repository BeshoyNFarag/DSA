/*Exercise 2 — Element Exists
Task: Return true/false.
// Input: [2, 4, 6, 8], target = 5
// Output: false
*/

package com.dsa.binary_search;

public class ElementExists {

    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8};
        System.out.println(elementExists(arr, 5));
    }

    private static boolean elementExists(int [] arr , int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int midposition = (low + high)/2;
            int midvalue = arr[midposition];

            if(midvalue == target){
                return true;
            }
            else if( midvalue < target){
                low = midposition + 1;
            }
            else{
                high = midposition - 1;
            }
        }
        return false;
    }
}
