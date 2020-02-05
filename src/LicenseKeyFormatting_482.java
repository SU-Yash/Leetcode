public class LicenseKeyFormatting_482 {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1, rem = k; i >= 0; i--) {
            if (s.charAt(i) == '-') continue;
            rem--;
            if (rem == 0) {
                res.append("-");
                rem = k;
            }
            res.append(Character.toUpperCase(s.charAt(i)));
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}