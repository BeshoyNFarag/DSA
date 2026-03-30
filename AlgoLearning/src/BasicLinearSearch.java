/*Part 1 — Linear Search Practice (O(n))
Exercise 1 — Basic Search

Task: Return the index of a target element.

// Input: [5, 3, 8, 2], target = 8
// Output: 2*/

public class BasicLinearSearch {

    public static int linearSearch(int [] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }

    public static void main(String [] args){
        int runs = 1000;
        int [] arr =  {5,3,8,2};
        int target = 8;
        long start = System.nanoTime();

        for(int i =0 ; i < runs ; i++){
            linearSearch(arr, 8);
        }
        long end = System.nanoTime();
        System.out.println((end - start) / runs + " Ns");

        System.out.println(linearSearch(arr, target));

    }
}
