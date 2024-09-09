public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=-1;
            }
        }
        int topRow=0,bottomRow=m-1,leftColumn=0,rightColumn=n-1;
        while(head!=null){
            for(int col=leftColumn;col<=rightColumn&& head!=null;col++){
                result[topRow][col]=head.val;
                head=head.next;
            }
            topRow++;
            for (int row = topRow; row <= bottomRow && head != null; row++) {
                result[row][rightColumn] = head.val;
                head = head.next;
            }
            rightColumn--;
            for (int col = rightColumn; col >= leftColumn && head != null; col--) {
                result[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;
            for (int row = bottomRow; row >= topRow && head != null; row--) {
                result[row][leftColumn] = head.val;
                head = head.next;
            }
            leftColumn++;
        }
        return result;
    }

Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
Explanation: The diagram above shows how the values are printed in the matrix.
Note that the remaining spaces in the matrix are filled with -1.
