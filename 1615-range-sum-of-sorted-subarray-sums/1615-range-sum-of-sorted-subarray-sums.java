class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                pq.add(sum);
            }
        }
        // System.out.println(pq);
        long sum=0;
        int i=1;
        while(i!=left)
            {
                pq.poll();
                i++;
            }

        for(int k=left;k<=right;k++)
        {
            sum+=pq.poll();
            sum %= 1000000007;
        }
        
        return (int) sum;
    }
}