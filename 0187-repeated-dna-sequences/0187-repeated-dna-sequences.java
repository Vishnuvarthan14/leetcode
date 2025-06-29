class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List <String> list = new ArrayList<>();
        HashMap <String,Integer> map = new HashMap<>();

        int i=0,j=10;
        while(j<=s.length())
        {
            String dna=s.substring(i,j);

            if(map.containsKey(dna))
                map.put(dna,map.get(dna)+1);
            else
                map.put(dna,1);

                i++;
                j++;
        }
       // System.out.println(map);

       for(String key:map.keySet())
            {
                if(map.get(key)>1)
                    list.add(key);
            }
        return list;
    }
}