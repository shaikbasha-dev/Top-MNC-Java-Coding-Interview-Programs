import java.util.ArrayDeque;
import java.util.Deque;

class CheckWhetherBracketsAreBalanced {
    public static void main(String[] args) {
        String expression = "{[()]}";
        Deque<Character> stack = new ArrayDeque<>();
        boolean balanced = true;

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || !matches(stack.pop(), ch)) {
                    balanced = false;
                    break;
                }
            }
        }

        balanced = balanced && stack.isEmpty();
        System.out.println("Balanced = " + balanced);
    }

    static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
    }
}
