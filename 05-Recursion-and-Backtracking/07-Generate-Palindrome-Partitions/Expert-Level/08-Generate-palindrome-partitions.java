import java.util.*;

class PalindromePartitions {
    static void partition(String text, int start, List<String> current) {
        if (start == text.length()) {
            System.out.println(current);
            return;
        }

        for (int end = start; end < text.length(); end++) {
            if (isPalindrome(text, start, end)) {
                current.add(text.substring(start, end + 1));
                partition(text, end + 1, current);
                current.remove(current.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String text, int left, int right) {
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        partition("aab", 0, new ArrayList<>());
    }
}
