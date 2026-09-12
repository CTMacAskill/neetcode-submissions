class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> letters1 = new HashMap<>();
        HashMap<Character, Integer> letters2 = new HashMap<>();

        for (int i=0; i < s.length(); i++){
            letters1.put(s.charAt(i), letters1.getOrDefault(s.charAt(i),0) +1);
            letters2.put(t.charAt(i), letters2.getOrDefault(t.charAt(i),0) +1);

        }
        return letters1.equals(letters2);
}
}