/*Exercise 3 — Count Occurrences
Task: Count how many times a number appears.
// Input: [2, 3, 2, 4, 2], target = 2
// Output: 3*/

public class CountOccurencesLinear {

    public static int count(int [] arr, int target){
        int count = 0;

        if (arr == null || arr.length == 0){
            return -1;
        }

        for(int number: arr){
            if(number == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr= {2, 3, 2, 4, 2};


        System.out.println(count(arr, 2));

    }
}
