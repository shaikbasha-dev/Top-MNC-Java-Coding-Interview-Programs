import java.util.LinkedList;
import java.util.Queue;

class StackUsingTwoQueues {
    Queue<Integer> first = new LinkedList<>();
    Queue<Integer> second = new LinkedList<>();

    void push(int value) {
        second.offer(value);
        while (!first.isEmpty()) second.offer(first.poll());
        Queue<Integer> temp = first;
        first = second;
        second = temp;
    }

    int pop() { return first.poll(); }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(10);
        stack.push(20);
        System.out.println("Popped = " + stack.pop());
    }
}
