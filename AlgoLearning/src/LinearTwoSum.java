/*Exercise 6 (Important) — Two Sum (Brute Force)
Task: Find indices of two numbers that add up to target.
// Input: [2, 7, 11, 15], target = 9
// Output: [0, 1]*/

public class LinearTwoSum {

    public static int [] findIndices(int [] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }

        }

        return new int[0];
    }
    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15};
        int [] result  =  findIndices(arr, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

}
