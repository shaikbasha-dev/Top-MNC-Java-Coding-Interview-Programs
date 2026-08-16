import java.util.Stack;

class CheckWhetherBracketsAreBalanced {
    public static void main(String[] args) {
        String expression = "{[()]}";
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;

        for (int i = 0; i < expression.length(); i++) {
            char currentCharacter = expression.charAt(i);

            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                stack.push(currentCharacter);
            } else if (currentCharacter == ')' || currentCharacter == ']' || currentCharacter == '}') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char openingCharacter = stack.pop();

                if ((currentCharacter == ')' && openingCharacter != '(') ||
                    (currentCharacter == ']' && openingCharacter != '[') ||
                    (currentCharacter == '}' && openingCharacter != '{')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        System.out.println("Balanced = " + balanced);
    }
}
