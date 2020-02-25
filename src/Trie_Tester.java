public class Trie_Tester {
    public static void main(String[] args) {
        Trie_ trie = new Trie_();
        trie.insert("Suy");
        System.out.println(trie.search("Suyash"));
        System.out.println(trie.startsWith("Su"));
    }
}
