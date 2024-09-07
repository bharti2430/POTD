// 1
long findNth(long n) {
        long i=1;
        long count=0;
        while(count<n){
            if(!digitContains9(i))
            {
                count++;
            }
            i++;
        }
        return i-1;
    }
    boolean digitContains9(long n){
        if(String.valueOf(n).contains("9"))
            return true;
        else
            return false;
    }

// 2
long findNth(long n) {
        return convertToBase9(n);
    }
    public static long convertToBase9(long n) {
        long result = 0;
        long multiplier = 1;

        // Convert n to base-9
        while (n > 0) {
            result += (n % 9) * multiplier;  // Take mod 9 and adjust the place value
            n /= 9;  // Reduce n for next higher place value
            multiplier *= 10;  // Move to next decimal place
        }

        return result;  // Return the base-9 number as a base-10 number
    }

Input: n = 8
Output: 8
Explanation: After removing natural numbers which contains digit 9, first 8 numbers are 1,2,3,4,5,6,7,8 and 8th number is 8.
Input: n = 9
Output: 10
Explanation: After removing natural numbers which contains digit 9, first 9 numbers are 1,2,3,4,5,6,7,8,10 and 9th number is 10.
Time Complexity: O(logn)
Auxiliary Space: O(1)

