public int robotSim(int[] commands, int[][] obstacles) {
        int x=0,y=0,d=0;
        int[][] direction={{0,1},{1,0},{0,-1},{-1,0}};
        int maxDistance=0;
        Set<String> obstacleSet=new HashSet<>();
        for(int[] obstacle:obstacles){
            obstacleSet.add(obstacle[0]+","+obstacle[1]);
        }
        for(int cmd:commands){
            if(cmd==-1){
                d=(d+1)%4;
            }
            else if(cmd==-2){
                d=(d+3)%4;
            }else{
                for(int i=0;i<cmd;i++){
                    int nx=x+direction[d][0];
                    int ny=y+direction[d][1];
                    if(obstacleSet.contains(nx+","+ny)){
                        break;
                    }
                    x=nx;
                    y=ny;
                    maxDistance=Math.max(maxDistance,x*x+y*y);
                }
            }
        }
        return maxDistance;
    }

Input: commands = [4,-1,3], obstacles = []
Output: 25
Explanation: The robot starts at (0, 0):
1. Move north 4 units to (0, 4).
2. Turn right.
3. Move east 3 units to (3, 4).
The furthest point the robot ever gets from the origin is (3, 4), which squared is 32 + 42 = 25 units away.
