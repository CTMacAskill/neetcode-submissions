class Solution {
    public boolean isValid(String s) {
        String[] characters = s.split("");
        List<String> stack = new ArrayList<>();
        for (String character : characters) {
            if ((character.equals("(") || (character.equals("{")) || character.equals("["))) {
                stack.addLast(character);
            }
            if ((character.equals(")") || (character.equals("}")) || character.equals("]"))) {
                if (stack.isEmpty()){
                    return false;
                }
                String openParentheses = stack.getLast();
                if (character.equals("]") && !openParentheses.equals("[")) {
                    return false;
                }
                if (character.equals("}") && !openParentheses.equals("{")) {
                    return false;
                }
                if (character.equals(")") && !openParentheses.equals("(")) {
                    return false;
                }
                else {
                    stack.removeLast();
                }
            }
        }
        return stack.isEmpty();
    }
}
