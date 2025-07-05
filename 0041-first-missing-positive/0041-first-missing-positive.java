class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n=nums.length;
        Arrays.sort(nums);
        LinkedHashSet <Integer> set = new LinkedHashSet<>();

        for(int i:nums)
            set.add(i);
        int arr[] = new int[set.size()];
            int l=0;

            for(int i:set)
                arr[l++]=i;

        int i=0;
        while(i<n&&arr[i]<=0)
            i++;

       // System.out.println(i);
        int k=1;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[j]!=k)
                return k;
            k++;
        }

        return k;
    }
}