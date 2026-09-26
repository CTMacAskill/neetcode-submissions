class PrefixTree {
    static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<>();
        boolean isEndofWord = false;
    }

    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (Character c : word.toCharArray()){
            cur.children.putIfAbsent(c,new TrieNode());
            cur = cur.children.get(c);
        }
        cur.isEndofWord = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (Character c : word.toCharArray()) {
            if (cur.children.containsKey(c)){
                cur = cur.children.get(c);
            }
        }
        return cur.isEndofWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (Character c : prefix.toCharArray()){
            if (!cur.children.containsKey(c)){
                return false;
            } else {
                cur = cur.children.get(c);
            }
        }
        return true;
    }
}
