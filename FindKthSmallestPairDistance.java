public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0,right=nums[nums.length-1]-nums[0];
        while(left<right){
            int mid=(left+right)/2;
            if(isSmallPairs(nums,k,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean isSmallPairs(int[] nums,int k,int mid){
        int count=0,left=0;
        for(int right=1;right<nums.length;right++){
            while(nums[right]-nums[left]>mid) left++;
            count+=right-left;
        }
        return (count>=k);
    }

Input: nums = [1,3,1], k = 1
Output: 0
Explanation: Here are all the pairs:
(1,3) -> 2
(1,1) -> 0
(3,1) -> 2
Then the 1st smallest distance pair is (1,1), and its distance is 0.

Input: nums = [1,1,1], k = 2
Output: 0

Input: nums = [1,6,1], k = 3
Output: 5
 
