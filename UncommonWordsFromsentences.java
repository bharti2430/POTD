public String[] uncommonFromSentences(String s1, String s2) {
        String s=s1+" "+s2;
        HashMap<String,Integer> wordsCount=new HashMap<>();
        String[] words=s.split(" ");
        for(String word:words){
            wordsCount.put(word,wordsCount.getOrDefault(word,0)+1);
        }
        List<String> result=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:wordsCount.entrySet()){
            if(entry.getValue()==1)
                result.add(entry.getKey());
        }
        String[] ans=new String[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Explanation:
The word "sweet" appears only in s1, while the word "sour" appears only in s2.

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
