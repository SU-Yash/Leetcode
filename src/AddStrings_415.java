public class AddStrings_415{
    public static String addStrings(String num1, String num2) {
        int carry = 0, idx1 = num1.length()-1, idx2= num2.length()-1;
        StringBuilder sb = new StringBuilder();
        while(idx1 >= 0 || idx2 >= 0 || carry > 0) {
            if(idx1 >= 0) carry += num1.charAt(idx1--) - '0';
            if(idx2 >= 0) carry += num2.charAt(idx2--) - '0';
            sb.append((char)(carry%10 + '0'));
            carry /= 10;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(addStrings("123", "123"));
    }
}
