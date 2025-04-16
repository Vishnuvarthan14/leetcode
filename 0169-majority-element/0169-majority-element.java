class Solution {
    public int majorityElement(int[] nums) {
         
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);

        List <Integer> list = new ArrayList<>();
        for(int key:map.keySet())
        {
            if(map.get(key)>(n/2))
                return key;
        }

    return -1;
        
    }
}