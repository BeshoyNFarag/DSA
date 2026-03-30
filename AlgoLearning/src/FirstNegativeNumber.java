/*Exercise 5 — First Negative Number
Task: Return the first negative number.
// Input: [3, 5, -2, 7]
// Output: -2*/

public class FirstNegativeNumber {
    public static int Negative(int [] arr){

        for (int num: arr){
            if (num < 0){
                return num;
            }
        }
        return 0;
    }


    public static void main(String [] args){
        int [] arr = {3, 5, -2, 7};
        System.out.println(Negative(arr));
    }
}
