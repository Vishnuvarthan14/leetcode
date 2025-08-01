class Solution {
    public int findCenter(int[][] edges) {
        Set <Integer> common = new HashSet<>();
        
        for(int i:edges[0])
            common.add(i);

            for(int i=1;i<edges.length;i++)
            {
                Set <Integer> set = new HashSet<>();
                for(int j:edges[i])
                    set.add(j);
                
                common.retainAll(set);

                if(set.isEmpty())
                    return -1;
            }
                for(int i:common)
                    return i;

                    return 0;
    }
}