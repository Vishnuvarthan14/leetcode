class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int arr[] = new int[k];
        int index=0;
        while(k!=0)
        {
            int max=-1;
            int ind=-1;

            for(int i:map.keySet())
            {
                if(map.get(i)>max)
                {
                    max=map.get(i);
                    ind=i;
                }
            }
            arr[index++]=ind;
            map.remove(ind);
            k--;
        }
    

        return arr;
    }
}