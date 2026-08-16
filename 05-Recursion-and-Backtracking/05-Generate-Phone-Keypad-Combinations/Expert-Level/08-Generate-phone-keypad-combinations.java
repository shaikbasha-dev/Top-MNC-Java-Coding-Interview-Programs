import java.util.*;

class PhoneKeypadCombinations {
    static final String[] KEYS = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }

        String letters = KEYS[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            generate(digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        generate("23", 0, new StringBuilder());
    }
}
