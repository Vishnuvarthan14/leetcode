class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // int k=1;
        // int n=arr.length;
        // int rank[]=new int[n];
        // int prev=-1;
        //  int min=Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++)
        // {
        //       prev=min;
        //       min=Integer.MAX_VALUE;
        //     int ind=-1;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(min>=arr[j])
        //         {
        //             min=arr[j];
        //             ind=j;
        //         }
        //     }
          
        //     if(prev!=min)
        //         rank[ind]=k++;
        //     else
        //         rank[ind]=k;

        //     arr[ind]=Integer.MAX_VALUE;
        //     System.out.println(prev);
        //     System.out.println(min);
        // }
        // return rank;
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            nums[i]=arr[i];

        int rank[]=new int[arr.length];
        Arrays.sort(arr);
        HashMap <Integer,Integer> map = new HashMap<>();
        int j=1;
        for(int i:arr)
        {
            if(!map.containsKey(i))
            {
                map.put(i,j++);
            }
        }
        // System.out.println(map);
        // System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++)
        {
            rank[i]=map.get(nums[i]);
        }
        
        return rank;
    }
}