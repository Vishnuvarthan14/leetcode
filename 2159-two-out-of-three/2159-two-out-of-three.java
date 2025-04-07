class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
      Set <Integer> set = new HashSet<>();
        for(int i:nums1)
        {
            for(int j:nums2)
            {
                if(i==j)
                    set.add(i);
                else
                {
                    for(int k:nums3)
                    {
                        if(i==k||j==k)
                        {
                            set.add(k);
                        }
                    }
                }
            }
        }
        List <Integer> list = new ArrayList<>();
        for(int i:set)
            list.add(i);

        return list;
    }
}