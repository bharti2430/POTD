public int numWaterBottles(int numBottles, int numExchange) {
        int drink=0;
        while(numBottles>0){
            drink++;
            numBottles--;
            int empty=drink%numExchange;
            if(empty==0){
                numBottles++;
            }
        }
        return drink;
    }

Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.

public int numWaterBottles(int numBottles, int numExchange) {
        int drink = 0;
        int emptyBottles = 0;
    
        while (numBottles > 0) {
            // Drink all current full bottles
            drink += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;

            // Exchange empty bottles for full bottles
            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }

        return drink;
    }
