import java.util.LinkedHashMap;
import java.util.Map;

class FindtheFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String text = "swiss";
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        Character answer = null;
        for (char ch : text.toCharArray()) {
            if (frequency.get(ch) == 1) {
                answer = ch;
                break;
            }
        }

        System.out.println(answer == null
                ? "No Non-Repeating Character"
                : "First Non-Repeating Character = " + answer);
    }
}
