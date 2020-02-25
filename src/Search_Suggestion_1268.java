import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Search_Suggestion_1268 {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TreeSet<String> ts = new TreeSet<>();
        for(String product: products){
            if(searchWord.charAt(0) == product.charAt(0)){
                ts.add(product);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(int i = 1; i< searchWord.length(); i++){
            List<String> temp = new ArrayList<>();
            TreeSet<String> new_ts = new TreeSet<>();

            for(String product: ts){
                if(temp.size() < 3){
                    temp.add(product);
                }
                if(i < searchWord.length() && i < product.length() && searchWord.charAt(i) == product.charAt(i)){
                    new_ts.add(product);
                }
            }
            ts = new_ts;
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> ans = suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse");
        for(List<String> l : ans){
            System.out.println(l);
        }
    }
}
