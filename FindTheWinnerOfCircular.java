public int findTheWinner(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int startIndex=0;
        while(list.size()!=1){
            int newIndex=(startIndex+k-1)%list.size();
            list.remove(newIndex);
            startIndex=newIndex;
        }
        return list.get(0);
    }

Input: n = 5, k = 2
Output: 3
Input: n = 6, k = 5
Output: 1
Explanation: The friends leave in this order: 5, 4, 6, 2, 3. The winner is friend 1.

//using recursion
public int findTheWinner(int n, int k) {
        return winnerHelper(n,k)+1;
    }
    private int winnerHelper(int n,int k){
        if(n==1)
            return 0;
        return (winnerHelper(n-1,k)+k)%n;
    }
