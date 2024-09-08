public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result=new ListNode[k];
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int partSize=size/k;
        int extra=size%k;
        temp=head;
        ListNode prev = temp;
        for(int i=0;i<k;i++){
            ListNode parts=temp;
            int currentSize=partSize;
            if(extra>0){
                extra--;
                currentSize++;
            }
            int j=0;
            while(j<currentSize){
                prev=temp;
                temp=temp.next;
                j++;
            }
            if (prev != null) {
                prev.next = null;
            }
            result[i]=parts;
        }
        return result;
    }

Input: head = [1,2,3], k = 5
Output: [[1],[2],[3],[],[]]
Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
Output: [[1,2,3,4],[5,6,7],[8,9,10]]
