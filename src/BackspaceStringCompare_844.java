import java.util.*;

public class BackspaceStringCompare_844 {
    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public static String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
    public static void main(String[] args){
        System.out.println(backspaceCompare("a#########dc", "dc"));
    }
}


