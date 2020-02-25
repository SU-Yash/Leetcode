import java.util.HashMap;

public class Pair_Of_Songs_1010 {
    public static int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t : time) {
            int r = t % 60;
            res += map.getOrDefault(r == 0 ? 0 : 60-r, 0);
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numPairsDivisibleBy60(new int[]{30,20,150,100,40}));
    }
}
