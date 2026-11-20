class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
int cnt = 0;

for (char ch : s.toCharArray()) {
    if (ch == '(') {
        if (cnt > 0) ans += ch;
        cnt++;
    } else {
        cnt--;
        if (cnt > 0) ans += ch;
    }
}
return ans;
    }
}