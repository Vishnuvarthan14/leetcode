class Solution {
    public int firstUniqChar(String s) {
    

        LinkedHashMap <Character,Integer> freq = new LinkedHashMap<>();
        LinkedHashMap <Character,Integer> index = new LinkedHashMap<>();

        for(char c:s.toCharArray())
        {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!index.containsKey(c))
                index.put(c,i);
        }

        for(char key:freq.keySet())
        {
            if(freq.get(key)==1)
            {
                return index.get(key);
            }
        }
        return -1;
    }
}