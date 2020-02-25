import java.util.HashMap;
import java.util.Map;

class MapSum_677 {
    HashMap<String, Integer> map;
    TrieNodeV root;
    public MapSum_677() {
        map = new HashMap();
        root = new TrieNodeV();
    }
    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        TrieNodeV cur = root;
        cur.score += delta;
        for (char c: key.toCharArray()) {
            cur.children.putIfAbsent(c, new TrieNodeV());
            cur = cur.children.get(c);
            cur.score += delta;
        }
    }
    public int sum(String prefix) {
        TrieNodeV cur = root;
        for (char c: prefix.toCharArray()) {
            cur = cur.children.get(c);
            if (cur == null) return 0;
        }
        return cur.score;
    }
}
class TrieNodeV {
    Map<Character, TrieNodeV> children = new HashMap();
    int score;
}