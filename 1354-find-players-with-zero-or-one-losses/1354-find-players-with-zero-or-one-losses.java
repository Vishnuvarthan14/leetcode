class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set <Integer> winner = new HashSet<>();

        HashMap <Integer,Integer> looser=new HashMap<>();

        for(int i=0;i<matches.length;i++)
        {
            winner.add(matches[i][0]);

            looser.put(matches[i][1],looser.getOrDefault(matches[i][1],0)+1);
        }
        // System.out.println(winner);
        // System.out.println(looser);
        List <List<Integer>> results=new ArrayList<>();
            
                List <Integer> list = new ArrayList<>();
                for(int i:winner)
                {
                    if(!looser.containsKey(i))
                        list.add(i);
                }
                Collections.sort(list);
                results.add(list);
                
                 List <Integer> list1 = new ArrayList<>();

                for(int key:looser.keySet())
                    {
                        if(looser.get(key)==1)
                            list1.add(key);
                    }
                    Collections.sort(list1);
                    results.add(list1);
        return results;
    }
}