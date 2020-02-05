public class SquaresOfASortedArray_977 {
    public static int[] sortedSquares(int[] a) {
        int i=0, j = a.length-1, k = j;
        int[] res = new int[a.length];
        while(i <= j){
            if(a[i]*a[i] > a[j]*a[j]){
                res[k--] = a[i]*a[i];
                ++i;
            }else{
                res[k--] = a[j]*a[j];
                --j;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = sortedSquares(new int[]{-4,-1,0,3,10});
        for(int elem: arr){
            System.out.println(elem);
        }
    }
}
