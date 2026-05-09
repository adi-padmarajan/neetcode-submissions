class Solution {
    public boolean isValid(String s) {
        Stack<Character> st1 = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(chr == '(' || chr == '{' || chr == '['){
                st1.push(chr);
            }
            else{
                if(st1.isEmpty()){
                    return false;
                }
                if(chr == ')' && st1.peek() == '(' ){
                    st1.pop();
                }
                else if(chr == '}' && st1.peek() == '{' ){
                    st1.pop();
                }
                else if(chr == ']' && st1.peek() == '[' ){
                    st1.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st1.isEmpty();
    }
}
