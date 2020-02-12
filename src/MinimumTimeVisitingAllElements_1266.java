public class MinimumTimeVisitingAllElements_1266 {
    public static int minTimeToVisitAllPoints(int[][] p) {
        int res = 0;
        for(int i = 1; i < p.length; i++) {
            int[] n1 = p[i-1], n2 = p[i];
            int w = Math.abs(n1[0]-n2[0]), h = Math.abs(n1[1]-n2[1]);
            res += Math.min(w, h)+Math.abs(h-w);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
    }
}
