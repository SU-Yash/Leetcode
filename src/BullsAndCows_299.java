public class BullsAndCows_299 {
    public static String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int len = secret.length();
        int[] hash = new int[10];
        for (int i = 0; i < len; i++) {
            int a = secret.charAt(i) - '0';
            int b = guess.charAt(i) - '0';
            if (a == b)
                bulls++;
            else {
                if (hash[a] < 0)//it indicates a has appeared in 'guess'
                    cows++;
                hash[a]++;
                if (hash[b] > 0)//it indicates b has appeared in 'secret'
                    cows++;
                hash[b]--;
            }
        }
        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args){
        System.out.println(getHint("1080", "1008"));
    }
}
