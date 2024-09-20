public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
                List<Integer> s1=diffWaysToCompute(expression.substring(0,i));
                List<Integer> s2=diffWaysToCompute(expression.substring(i+1));
                for(int a:s1){
                    for(int b:s2){
                        if(ch=='+') res.add(a+b);
                        else if(ch=='-') res.add(a-b);
                        else if(ch=='*') res.add(a*b);
                    }
                }
            }
        }
        if(res.isEmpty()) res.add(Integer.parseInt(expression));
        return res;
    }

Input: expression = "2-1-1"
Output: [0,2]
Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2

Input: expression = "2*3-4*5"
Output: [-34,-14,-10,-10,10]
Explanation:
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
