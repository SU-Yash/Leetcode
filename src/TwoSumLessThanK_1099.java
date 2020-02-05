import java.util.Arrays;

public class TwoSumLessThanK_1099 {
    public static int twoSumLessThanK(int[] A, int K) {
        int i = 0, j = A.length - 1, S = -1;

        Arrays.sort(A);

        while (i < j) {
            int sum = A[i] + A[j];

            if (sum < K) {
                S = Math.max(S, sum);
                i++;
            } else{
                j--;
            }
        }

        return S;
    }
    public static void main(String[] args){
        System.out.println(twoSumLessThanK(new int[]{1, 2, 34, 4, 5, 6, 23, 12}, 50));
    }
}
