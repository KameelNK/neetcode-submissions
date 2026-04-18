class Solution {
    public boolean isValid(String s) {
        
    Stack<Character> parents = new Stack<>();

    for (char c: s.toCharArray()) {
        if (c == '(') {
            parents.push(')');
        }
        else if (c == '{') {
            parents.push('}');
        }
        else if (c == '[') {
            parents.push(']');
        }
        else if (parents.isEmpty() || parents.pop() != c) {
            return false;
        }
     }
     return parents.isEmpty();

    }
}
