class PrefixTree {
    class TrieNode{
        boolean isEndOfWord = false;
        HashMap<Character,TrieNode> children = new HashMap<>();
    }

    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (Character c : word.toCharArray()) {
            cur.children.putIfAbsent(c, new TrieNode());
            cur = cur.children.get(c);
        }
        cur.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (Character c : word.toCharArray()){
            if (cur.children.containsKey(c)){
                cur = cur.children.get(c);
            }
        }
        return cur.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (Character c : prefix.toCharArray()){
            if (cur.children.containsKey(c)){
                cur = cur.children.get(c);
            } else {
                return false;
            }
        }
        return true;
    }
}
