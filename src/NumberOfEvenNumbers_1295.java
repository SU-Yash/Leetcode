public class NumberOfEvenNumbers_1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums)
            if(digits(n) % 2 == 0)
                ++count;
        return count;
    }
    private static int digits(int n){
        int digits = 0;
        while(n > 0){
            ++digits;
            n/=10;
        }
        return digits;
    }

    public static void main(String[] args){
        System.out.println(findNumbers(new int[]{213, 12, 32, 1234}));
    }
}
