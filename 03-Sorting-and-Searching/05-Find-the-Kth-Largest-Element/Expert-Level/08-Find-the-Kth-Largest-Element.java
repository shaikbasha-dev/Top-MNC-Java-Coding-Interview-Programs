import java.util.PriorityQueue;

class FindTheKthLargestElement {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int x : a) {
            heap.offer(x);
            if (heap.size() > k) heap.poll();
        }

        System.out.println("Kth Largest Element = " + heap.peek());
    }
}
