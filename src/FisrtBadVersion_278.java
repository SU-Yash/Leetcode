public class FisrtBadVersion_278 {
    private String[] arr;

    public boolean isBadVersion(int mid){
        if(arr[mid].equals("B")) return true;
        return false;
    }

    public int firstBadVersion(int n) {
        int left = 0;
        int right = n-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left+1;
    }

    public static void main(String[] args){
        FisrtBadVersion_278 fbv = new FisrtBadVersion_278();
        fbv.arr = new String[]{"G", "G", "B", "B"};
        System.out.println(fbv.firstBadVersion(4));
    }
}
