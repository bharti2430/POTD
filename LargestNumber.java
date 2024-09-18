public String largestNumber(int[] nums) {
        String[] num=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));
        if(num[0].equals("0")){
            return "0";
        }
        StringBuilder largest=new StringBuilder();
        for(int i=0;i<num.length;i++){
            largest.append(num[i]);
        }
        return largest.toString();
    }

Input: nums = [10,2]
Output: "210"

Input: nums = [3,30,34,5,9]
Output: "9534330"
 
