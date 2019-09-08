/*
1) Set two helper variables
    (a) input_index = keeps track of the input index
    (b) result_index = keeps track of the result index
2) Construct a count array from the mask string, for each char in the mask string we set '1'.
3) Process each char in the input string, if the count in the mask array is 0, only then we add it to
   the result string.
4) Add string terminator '\0' to the end of the result string.
 */


public class strRemoval {
    static final int NUM_CHARS = 256;

    // Creates an array that counts the characters in the passed array
    static int[] getCharCountArray(String str) {
        int count[] = new int [NUM_CHARS];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        return count;
    }

    // Takes two strings, first str is the string to remove the chars from, second one is the mask
    static String removeDirtyChars(String str, String mask) {
        int count[] = getCharCountArray(mask);
        int input_index = 0;
        int result_index = 0;

        char arr[] = str.toCharArray();

        while (input_index != arr.length) {
            char temp = arr[input_index];
            if (count[temp] == 0) {
                arr[result_index] = arr[input_index];
                result_index++;
            }
            input_index++;
        }
        str = new String(arr);

        return str.substring(0,result_index);
    }
}
