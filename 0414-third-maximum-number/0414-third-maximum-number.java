class Solution {
    public int thirdMax(int[] nums) {
       PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());

        Set <Integer> set = new HashSet<>();

        for(int i:nums)
            set.add(i);
        if(set.size()<3)
        {
            int max=-1;
            for(int i:nums)
                {
                    if(max<i)
                        max=i;
                }
                return max;
        }

   
        for(int i:set)
            heap.add(i);
        // System.out.println(heap);
        for(int i=0;i<2;i++)
            heap.poll();

        return heap.peek();
    }
}