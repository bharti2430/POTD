public int passThePillow(int n, int time) {
        int direction=1,holdingPerson=1,currentTime=0;
        while(currentTime<time){
            if(holdingPerson==n){
                direction*=-1;
            }
            else if(holdingPerson==1){
                direction=1;
            }
            holdingPerson+=direction;
            currentTime++;
        }
        return holdingPerson;
    }

Input: n = 4, time = 5
Output: 2
Input: n = 3, time = 2
Output: 3

//Using Math
public int passThePillow(int n, int time) 
{
    int fullRounds=time/(n-1);
    int extraTime=time%(n-1);
    if(fullRounds%2==0)
        return extraTime+1;
    else
        return n-extraTime;
}
