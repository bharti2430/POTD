The operations are described below:

"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
"./" : Remain in the same folder.
"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
  
// using stack O(n) & O(n)
public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(String log:logs){
            if(log.equals("../")){
                if(!st.isEmpty()) st.pop();
            }
            else if(!log.equals("./")){
                st.push(log);
            }
        }
        return st.size();
    }

// normal iteration O(n) & O(1)
public int minOperations(String[] logs) {
    int folderDepth = 0;
    for (String log : logs) {
        if (log.equals("../")) {
            folderDepth = Math.max(0, folderDepth - 1);
        } else if (!log.equals("./")) {
            folderDepth++;
        }
    }
    return folderDepth;
}

Input: logs = ["d1/","d2/","../","d21/","./"]
Output: 2
Explanation: Use this change folder operation "../" 2 times and go back to the main folder.

Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
Output: 3
