public class SplitAStringInBalancedStrings_1221 {
    public static int balancedStringSplit(String s) {
        int count = 0, curr = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'R')
                curr--;
            else
                curr++;
            if(curr == 0)
                ++count;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(balancedStringSplit("LLRRLRLRLR"));
    }
}
