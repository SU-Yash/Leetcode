public class SortArrayByParity_905 {
    public static int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }
    public static void main(String[] args){
        int[] arr = sortArrayByParity(new int[]{3, 5, 4, 2, 1});
        for(int elem: arr){
            System.out.println(elem);
        }
    }
}
