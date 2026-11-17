class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.empty())return false;
                char top=st.pop();
                if(top=='('&& ch!=')'||top=='{'&& ch!='}'||top=='['&& ch!=']')
                return false;
            }
        }
        if(st.empty())return true;
        else return false;
    }
}