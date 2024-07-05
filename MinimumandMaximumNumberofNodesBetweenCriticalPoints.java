A critical point in a linked list is defined as either a local maxima or a local minima.
A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.
A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.
Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.
Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] where minDistance is the minimum distance between any two distinct critical points and maxDistance is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return [-1, -1].

// Self approach
public int[] nodesBetweenCriticalPoints(ListNode head) {
        int result[]=new int[2];
        if(head==null || head.next==null || head.next.next==null){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        ListNode temp=head.next,prevNode=head,nextNode=null;
        ArrayList<Integer> count=new ArrayList<>();
        int cnt=1;
        while(temp.next!=null){
            cnt++;
            nextNode=temp.next;
            if((temp.val>nextNode.val && temp.val>prevNode.val) || (temp.val<nextNode.val && temp.val<prevNode.val))
               {
                count.add(cnt);
               }
               prevNode= temp;
               temp=temp.next;    
        }
        int size=count.size();
        if(size==0 || size==1){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int diff=count.get(j)-count.get(i);
                maxi=Math.max(maxi,diff);
                mini=Math.min(mini,diff);
            }
        }
        result[0]=mini;
        result[1]=maxi;
        return result;
    }

Input: head = [3,1]
Output: [-1,-1]
Input: head = [5,3,1,2,5,1,2]
Output: [1,3]

int mini=Integer.MAX_VALUE,maxi=count.get(size-1)-count.get(0);
for(int i=1;i<size;i++){
    int diff=count.get(i)-count.get(i-1);
    mini=Math.min(mini,diff);
}
