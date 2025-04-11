class Solution {
    public int minimumRounds(int[] tasks) {
       
        HashMap <Integer,Integer> map =new HashMap<>();

        for(int i:tasks)
            map.put(i,map.getOrDefault(i,0)+1);

    int job=0;
        for(int key:map.keySet())
        {
            int temp=map.get(key);

           if(temp==1)
            return -1;
            if(temp%3==0)
                job+=temp/3;
            else
                job+=(temp/3)+1;
        }
        return job;
    }
}