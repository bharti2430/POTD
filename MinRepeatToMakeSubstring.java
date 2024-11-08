static int minRepeats(String s1, String s2) {
        String c="";
        int cnt=0;
        while(c.length()<=2*s2.length()){
            c+=s1;
            cnt++;
            if(c.contains(s2))
                return cnt;
        }
        return -1;
    }

Input: s1 = "ww", s2 = "www"
Output: 2
Explanation: Repeating s1 two times (wwww), s2 is a substring of it.

Input: s1 = "ab", s2 = "cab"
Output: -1
Explanation: No matter how many times we repeat s1, we can't get a string such that s2 is a substring of it.
