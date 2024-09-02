public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        while(k>0){
            if(k<chalk[i])
                return i;
            k-=chalk[i];
            i++;
            if(i==chalk.length) i=0;
        }
        return i;
    }

// second
public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        long totalChalk=0;
        for(int num:chalk){
            totalChalk+=num;
        }
        int remainingChalk=(int)(k%totalChalk);
        while(remainingChalk>0){
            if(remainingChalk<chalk[i])
                return i;
            remainingChalk-=chalk[i];
            i++;
        }
        return i;
    }

//example
Input: chalk = [5,1,5], k = 22
Output: 0
Explanation: The students go in turns as follows:
- Student number 0 uses 5 chalk, so k = 17.
- Student number 1 uses 1 chalk, so k = 16.
- Student number 2 uses 5 chalk, so k = 11.
- Student number 0 uses 5 chalk, so k = 6.
- Student number 1 uses 1 chalk, so k = 5.
- Student number 2 uses 5 chalk, so k = 0.
Student number 0 does not have enough chalk, so they will have to replace it.
