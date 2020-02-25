import java.util.HashMap;
import java.util.Map;

class TrieNode{
    public boolean isWord;
    public Map<Character, TrieNode> childrenMap = new HashMap<>();
}

public class Trie_ {

    TrieNode root;

    /** Initialize your data structure here. */
    public Trie_() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode temp = root;
        for(int i=0; i< word.length(); i++){
            char c = word.charAt(i);
            if(temp.childrenMap.get(c) == null){
                temp.childrenMap.put(c, new TrieNode());
            }
            temp = temp.childrenMap.get(c);
        }
        temp.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode temp = root;
        for(int i =0; i<word.length(); i++){
            char c = word.charAt(i);
            if(temp.childrenMap.get(c) == null){
                return false;
            }
            temp = temp.childrenMap.get(c);
        }
        return temp.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode temp = root;

        for(int i=0; i< prefix.length(); i++){
            char c = prefix.charAt(i);
            if(temp.childrenMap.get(c) == null){
                return false;
            }
            temp = temp.childrenMap.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
