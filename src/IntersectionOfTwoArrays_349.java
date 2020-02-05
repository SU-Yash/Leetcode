import java.util.*;
public class IntersectionOfTwoArrays_349 {
    public static int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int [] output = new int[set1.size()];
        int idx = 0;
        for (Integer s : set1)
            if (set2.contains(s)) output[idx++] = s; // O(1) operation

        return Arrays.copyOf(output, idx);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        // O(n)
        for (Integer n : nums1) set1.add(n);

        HashSet<Integer> set2 = new HashSet<Integer>();
        // O(m)
        for (Integer n : nums2) set2.add(n);

        // O(n) or O(m)
        if (set1.size() < set2.size()) return set_intersection(set1, set2);
        else return set_intersection(set2, set1);
    }
    public static void main(String[] args){

        for(int elem: intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})) System.out.println(elem);

    }
}
