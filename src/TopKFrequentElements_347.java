import java.util.*;
public class TopKFrequentElements_347 {
        public static List<Integer> topKFrequent(int[] nums, int k) {
            // build hash map : character and how often it appears
            HashMap<Integer, Integer> count = new HashMap();
            for (int n: nums) {
                count.put(n, count.getOrDefault(n, 0) + 1);
            }

            // init heap 'the less frequent element first'
            PriorityQueue<Integer> heap =
                    new PriorityQueue<Integer>((n1, n2) -> count.get(n2) - count.get(n1));

            // keep k top frequent elements in the heap
            for (int n: count.keySet()) {
                heap.add(n);
            }

            // build output list
            List<Integer> top_k = new ArrayList<>();
            int count_ = 0;
            while (count_ < k) {
                top_k.add(heap.poll());
                count_ += 1;
            }
            //Collections.reverse(top_k);
            return top_k;
        }

    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }
}
