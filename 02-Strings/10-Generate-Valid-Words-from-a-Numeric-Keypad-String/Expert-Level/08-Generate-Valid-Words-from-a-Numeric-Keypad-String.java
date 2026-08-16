import java.util.ArrayList;
import java.util.List;

class GenerateValidWordsfromaNumericKeypadString {
    private static final String[] KEYPAD =
            {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = new ArrayList<>();

        if (!digits.isEmpty()) {
            generate(digits, 0, new StringBuilder(), result);
        }

        System.out.println("Combinations = " + result);
    }

    private static void generate(String digits, int index,
                                  StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generate(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
