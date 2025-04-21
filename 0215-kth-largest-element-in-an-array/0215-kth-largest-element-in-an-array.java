class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // PriorityQueue <Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        // for(int i:nums)
        //     heap.add(i);

        // for(int i=0;i<k-1;i++)
        //     heap.poll();

        // return heap.peek();

        ArrayList <Integer> list = new ArrayList<>();

        for(int i:nums)
            {
                    list.add(i);
            }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        return list.get(k-1);
    }
}