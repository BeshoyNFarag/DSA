/*Task: Return true if element exists, else false.
// Input: [1, 4, 6, 9], target = 3
// Output: false

*/

public class LinearIf {

    public static boolean exist (int [] arr, int target){
        for(int x : arr){
            if(x == target)
                return true;
        }
        return false;
    }


    public static void main(String [] args){
        int [] arr =  {1,4,6,9};
        int target = 3;

        System.out.println(exist(arr, target));

    }
}
