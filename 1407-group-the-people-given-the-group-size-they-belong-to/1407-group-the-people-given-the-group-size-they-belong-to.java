class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();

        HashMap <Integer,ArrayList<Integer>> map= new HashMap<>();
        int n=groupSizes.length;
        for(int i=0;i<n;i++)
        {
            int key=groupSizes[i];

            if(!map.containsKey(key))
                map.put(key,new ArrayList<Integer>());
            map.get(key).add(i);
        }

       // System.out.println(map);

        for(int key:map.keySet())
        {
            // ArrayList temp = map.get(key);
            // int len=temp.size();
            List <Integer> new_list = new ArrayList<>();
            int count=0;
            for(int val:map.get(key))
            {
                count++;
                new_list.add(val);
                if(count%key==0)
                {
                    // System.out.println(count);
                    list.add(new ArrayList<>(new_list));
                    new_list.clear();
                }
            }
        }
        return list;
    }
}