class FindSumPairs {

        private int nums1[];
        private int nums2[];
        private HashMap <Integer,Integer> map ;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 =nums1;
        this.nums2 =nums2;

        map = new HashMap<>();
        for(int i:nums2)
            {
               map.put(i, map.getOrDefault(i, 0) + 1);
            }
    }
    
    public void add(int index, int val) {
        int old=nums2[index];
        nums2[index]+=val;
        
        map.put(old,map.get(old)-1);
        if(map.get(old)==0)
            map.remove(old);
       
       map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);

    }
    
    public int count(int tot) {
        int sum=0;
        for(int i:nums1)
        {
            int temp=tot-i;
            if(map.containsKey(temp))
                sum+=map.get(temp);
        }
        return sum;

    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */