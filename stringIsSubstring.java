// Or simply, check if s1.toLowerCase().contains(s2.toLowerCase()).

public class stringIsSubstring {

    static int isSubstring(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();

        for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j < M; j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
                if (j == M) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
