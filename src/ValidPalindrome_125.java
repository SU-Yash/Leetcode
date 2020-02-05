public class ValidPalindrome_125 {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        s = s.toLowerCase();

        int n = s.length(), i = 0, j = n - 1;

        char[] chars = s.toCharArray();

        while (i < j) {
            // skip any non-alphanumeric character
            while (i < n && !Character.isLetterOrDigit(chars[i])) { i++; }
            while (j >= 0 && !Character.isLetterOrDigit(chars[j])) { j--; }

            if (i < j && chars[i++] != chars[j--]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("abadaba"));
    }
}
