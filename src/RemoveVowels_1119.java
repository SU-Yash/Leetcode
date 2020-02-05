public class RemoveVowels_1119 {
    public static String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) if (!isVowel(Character.toLowerCase(c))) sb.append(c);
        return sb.toString();
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args){
        System.out.println(removeVowels("aeiouhg"));
    }
}
