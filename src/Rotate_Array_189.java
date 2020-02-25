public class Rotate_Array_189 {
    public static int[] rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] ans = rotate(new int[] {1, 2, 3, 4, 5, 6, 7}, 3);
        for(int elem: ans)
            System.out.println(elem);
    }
}
