import java.util.*;

public class KthLargestInQueue {
    public static void main(String[] args) {
                Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(40);
        queue.add(20);
        queue.add(50);
        queue.add(30);

        int k = 3;
        int kthLargest = findKthLargest(queue, k);
        System.out.println(k + "rd largest element is: " + kthLargest);
    }

    public static int findKthLargest(Queue<Integer> queue, int k) {
                List<Integer> list = new ArrayList<>(queue);

                Collections.sort(list, Collections.reverseOrder());

                if (k <= list.size()) {
            return list.get(k - 1);
        } else {
            throw new IllegalArgumentException("k is larger than the queue size");
        }
    }
}
