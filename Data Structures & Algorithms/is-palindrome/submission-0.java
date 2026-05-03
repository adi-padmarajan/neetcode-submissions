class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String new_string = "";
        String reverse_string = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                new_string += s.charAt(i);
            }
        }
        for(int i = new_string.length() - 1; i >= 0; i--){
            reverse_string += new_string.charAt(i);
        }
        return(new_string.equals(reverse_string));
    }
}
