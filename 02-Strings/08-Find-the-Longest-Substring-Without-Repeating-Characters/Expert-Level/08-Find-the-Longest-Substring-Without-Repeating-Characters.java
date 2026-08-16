import java.util.HashMap;
import java.util.Map;

class FindtheLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String text = "abcabcbb";
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0;
        int maximumLength = 0;

        for (int right = 0; right < text.length(); right++) {
            char ch = text.charAt(right);

            if (lastSeen.containsKey(ch) && lastSeen.get(ch) >= left) {
                left = lastSeen.get(ch) + 1;
            }

            lastSeen.put(ch, right);
            maximumLength = Math.max(maximumLength, right - left + 1);
        }

        System.out.println("Length = " + maximumLength);
    }
}
