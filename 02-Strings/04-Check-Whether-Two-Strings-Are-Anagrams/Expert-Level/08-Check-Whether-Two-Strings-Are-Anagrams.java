import java.util.HashMap;
import java.util.Map;

class CheckWhetherTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        if (first.length() != second.length()) {
            System.out.println("Are Anagrams = false");
            return;
        }

        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : first.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : second.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) - 1);
        }

        boolean anagram = true;
        for (int count : frequency.values()) {
            if (count != 0) {
                anagram = false;
                break;
            }
        }

        System.out.println("Are Anagrams = " + anagram);
    }
}
