import java.util.ArrayList;
import java.util.List;

class GenerateValidWordsfromaNumericKeypadString {
    public static void main(String[] args) {
        String digits = "23";
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> combinations = new ArrayList<>();

        generateCombinations(digits, 0, "", keypad, combinations);

        System.out.println("Combinations = " + combinations);
    }

    static void generateCombinations(String digits, int index, String current,
                                      String[] keypad, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1,
                    current + letters.charAt(i), keypad, combinations);
        }
    }
}
