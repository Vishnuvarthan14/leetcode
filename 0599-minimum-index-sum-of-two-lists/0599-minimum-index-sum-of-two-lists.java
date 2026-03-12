class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap <String, List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],new ArrayList<>());
            map.get(list1[i]).add(i);
            }

         for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i]))
                map.get(list2[i]).add(i);
            else
            {
                 map.put(list2[i],new ArrayList<>());
                map.get(list2[i]).add(i);
            }
         }

        int min=Integer.MAX_VALUE;
        for(String key:map.keySet())
        {
            if(map.get(key).size()==2){
                if(map.get(key).get(0)+map.get(key).get(1)<min)
                {
                    min=map.get(key).get(0)+map.get(key).get(1);
                }
            }
        }
       // System.out.println(min);
        String val="";
        for(String key:map.keySet())
        {
             if(map.get(key).size()==2){
                if(map.get(key).get(0)+map.get(key).get(1)==min)
                {
                   val+=key+",";
                }
            }
        }
        if(val.length()==0)
        return new String[]{};

        return val.split(",");
    }
}