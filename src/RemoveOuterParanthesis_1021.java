import java.util.Stack;

public class RemoveOuterParanthesis_1021 {
    public static String removeOuterParentheses(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        for(int i=0; i < str.length(); i++){
            int j = 0;
            char ch = str.charAt(i);
            if(ch == '(')
                s.push(i);
            else
                j = s.pop();
            if(s.isEmpty())
                sb.append(str.substring(j+1, i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(removeOuterParentheses("(()())(())"));
    }
}
