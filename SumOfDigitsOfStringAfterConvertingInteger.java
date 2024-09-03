// 1
class Solution {
    public int getLucky(String s, int k) {
        String st = "";
        for(int i = 0; i < s.length(); i++) {
            st += (s.charAt(i) & 31);
        }

        while(k > 0) {
            int ans = 0;
            for(int i = 0; i < st.length(); i++) {
                ans += (st.charAt(i) - '0');
            }
            st = Integer.toString(ans);
            k--;
        }

        int ans = Integer.parseInt(st);
        return ans;
    }
}

// 2
class Solution {
    public int getLucky(String s, int k) {
        String st = "";
        for(int i = 0; i < s.length(); i++) {
            st += (s.charAt(i) - 'a' + 1);
        }

        while(k > 0) {
            int ans = 0;
            for(int i = 0; i < st.length(); i++) {
                ans += (st.charAt(i) - '0');
            }
            st = Integer.toString(ans);
            k--;
        }

        int ans = Integer.parseInt(st);
        return ans;
    }
}

Input: s = "iiii", k = 1
Output: 36
Explanation: The operations are as follows:
- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.
