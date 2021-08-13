package programmers;

public class LongestPalindrome {
    public int solution(String s) {
        for (int i = s.length(); i > 1; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                boolean isPalindrome = true;
                for (int k = 0; k < i / 2; k++) {
                    if (s.charAt(j + k) != s.charAt(i + j - k - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome)   return i;
            }
        }
        return 1;
    }
}
