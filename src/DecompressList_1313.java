import java.util.*;
public class DecompressList_1313 {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i += 2) {
            for(int j = 0; j < nums[i]; j++) res.add(nums[i+ 1]);
        }

        int[] ret = new int[res.size()];
        for(int i = 0; i < ret.length; i++) ret[i] = res.get(i);
        return ret;
    }
    public static void main(String[] args){
        for(int elem : decompressRLElist(new int[]{1, 2, 3, 4})) System.out.println(elem);

    }
}
