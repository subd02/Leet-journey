class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1= new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                s1.push(')');
            }else if(s.charAt(i)=='{'){
                s1.push('}');
            }else if(s.charAt(i)=='['){
                s1.push(']');
            }
            else if(s1.size()==0 || s1.pop()!=s.charAt(i)){
                return false;
            }
        }
        return s1.isEmpty();
    }
}