class Solution {
    public int totalFruit(int[] fruits) {
        
        int i=0,j=0;
        int max=-1;
        HashMap <Integer,Integer> map = new HashMap<>();

        while(j<fruits.length)
        {
              map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
               while(map.size()>2)
               {
                int fruit = fruits[i];

                map.put(fruit,map.get(fruit)-1);
                if(map.get(fruit)==0)
                    map.remove(fruit);

                i++;
               }
            
             
                max=Math.max(max,j-i+1);
                 j++;
            
        }
         return max;

    }
}