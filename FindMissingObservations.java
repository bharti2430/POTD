public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum_m=0,m=rolls.length;
        for(int num:rolls){
            sum_m+=num;
        }
        int sum_n=(mean*(n+m))-sum_m;
        // Check if it's possible to distribute missingSum across n rolls
        if (sum_n < n || sum_n > 6 * n) {
            return new int[0];  // return empty array
        }
        int result[]=new int[n];
        int q=sum_n/n;
        int r=sum_n%n;
        for(int i=0;i<n;i++){
            result[i]=q;
        }
        for(int i=0;i<r;i++){
            result[i]++;
        }
        return result;
    }

Input: rolls = [3,2,4,3], mean = 4, n = 2
Output: [6,6]
Explanation: The mean of all n + m rolls is (3 + 2 + 4 + 3 + 6 + 6) / 6 = 4.
