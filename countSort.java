/*
Sorts an array that consists of 0,1,2 in O(n) time.
 */

public class countSort {
    public static void sort012(int arr[]) {
        // Initialize variables to count each number
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        // For every number in the array, add to the correct counter
        for (int i = 0; i < arr.length; i++) {
            switch(arr[i]){
                case(0):
                    count0++;
                    break;
                case(1):
                    count1++;
                    break;
                case(2):
                    count2++;
                    break;
            }
        }
        // Iterate through the array again, placing the numbers in their correct order.
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0+count1; i < count0+ count1+ count2; i++) {
            arr[i] = 2;
        }
    }
}
