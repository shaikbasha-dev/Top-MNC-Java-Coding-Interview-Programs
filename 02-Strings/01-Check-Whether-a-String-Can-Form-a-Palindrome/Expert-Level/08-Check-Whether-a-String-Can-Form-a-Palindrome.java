import java.util.HashMap;
import java.util.Map;

class CheckWhetheraStringCanFormaPalindrome {
    public static void main(String[] args) {
        String text = "carrace";
        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        int odd = 0;
        for (int count : frequency.values()) {
            if ((count & 1) == 1) odd++;
        }

        System.out.println("Can Form Palindrome = " + (odd <= 1));
    }
}
