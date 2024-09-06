// 1
public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        Arrays.sort(nums);
        while(temp.next!=null){
            if(searching(nums,temp.next.val)){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
            
        }
        return dummy.next;
    }
    private boolean searching(int[] nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return true;
            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }

// 2
public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head!=null){
            if(!set.contains(head.val)){
                temp.next=new ListNode(head.val);
                temp=temp.next;
            }
            head=head.next;
        }
        return dummy.next;
    }

Input: nums = [1,2,3], head = [1,2,3,4,5]

Output: [4,5]
