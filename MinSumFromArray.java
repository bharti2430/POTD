String minSum(int[] arr) {
        Arrays.sort(arr);
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                s1.append(arr[i]);
            }
            else{
                s2.append(arr[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int i=s1.length()-1;
        int j=s2.length()-1;
        while(i>=0 || j>=0 || carry>0){
            int digit1=(i>=0) ? s1.charAt(i--)-'0':0;
            int digit2=(j>=0) ? s2.charAt(j--)-'0':0;
            int sum=digit1+digit2+carry;
            sb.append(sum%10);
            carry=sum/10;
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

Input: arr[] = [6, 8, 4, 5, 2, 3]
Output: 604
Explanation: The minimum sum is formed by numbers 358 and 246.
Input: arr[] = [5, 3, 0, 7, 4]
Output: 82
Explanation: The minimum sum is formed by numbers 35 and 047.
