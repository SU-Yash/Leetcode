import java.util.*;
class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args){
        TwoSum_1 ts = new TwoSum_1();
        int[] answer = ts.twoSum(new int[]{4, 7, 4, 15}, 8);
        System.out.println(answer[0] + " " + answer[1]);
    }
}