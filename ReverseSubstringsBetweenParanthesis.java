public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(result.length());
            }
            else if(ch==')')
            {
                int start=st.pop();
                reverse(result,start,result.length()-1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    private void reverse(StringBuilder s,int start,int end){
        while(start<end){
            char temp=s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,temp);
            start++;
            end--;
        }
    }

Input: s = "(abcd)"
Output: "dcba"

Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
