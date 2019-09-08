import java.util.Arrays;
import java.util.HashMap;

public class twoSumSol {

    /*
    Two SUM solution using Hashing.
     */
    private static int[] twoSumHashing(int[] array, int sum) {
        // Create a new HashMap we'll use to store the difference in.
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        // Loop over the array, if the difference between sum and arr[i] exists in the HashMap
        // return the indices.
        for(int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(sum - array[i])) {
                return new int[] {hashMap.get(sum - array[i]), i};
            }
            // Otherwise, add arr[i] to the HashMap for further reference.
            else {
                hashMap.put(array[i], i);
            }
        }
        // In case we don't find any indices, return -1 -1
        return new int[]{-1,-1};
    }

    /*
    Two SUM solution using a naive nested loop.
     */
    private static int[] twoSumNaive(int[] array, int sum) {
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    /*
    Tester
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int sum = 17;
        System.out.println("The two Indices are: " + Arrays.toString(twoSumHashing(arr,sum)));
        System.out.println("The two naive Indices are: " + Arrays.toString(twoSumNaive(arr, sum)));
    }
}
