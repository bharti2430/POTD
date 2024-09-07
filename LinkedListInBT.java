public boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head,head,root);
    }
    boolean dfs(ListNode head,ListNode curr,TreeNode root){
        if(curr==null) return true;
        if(root==null) return false;
        if(curr.val==root.val) curr=curr.next;
        else if(head.val==root.val) head=head.next;
        else curr=head;
        return dfs(head,curr,root.left) || dfs(head,curr,root.right);
    }

Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
Output: true
