public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            int a=temp.val;
            int b=temp.next.val;
            int gcd=findGCD(a,b);
            ListNode newnode=new ListNode(gcd);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }
        return head;
    }
    private int findGCD(int a,int b){
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

Input: head = [18,6,10,3]
Output: [18,6,6,2,10,1,3]

private int findGCD(int a,int b){
        while (b != 0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
