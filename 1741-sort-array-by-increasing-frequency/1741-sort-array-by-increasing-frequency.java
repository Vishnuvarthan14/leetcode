class Solution {
    public int[] frequencySort(int[] nums) {
        
        int arr[] =new int[nums.length];

        int freq[]=new int[201];

        for(int i:nums)
            freq[i+100]++;

        int i=0;
        while(i<nums.length)
        {
            int min=Integer.MAX_VALUE;
            int ind=0;

            for(int j=0;j<201;j++)
            {
                if(freq[j]!=0)
                {
                    if(min>=freq[j])
                        {
                            min=freq[j];
                            ind=j;
                        }
                }
            }
            //System.out.println(ind);
            arr[i++]= ind-100;
            freq[ind]--;
        }
     //  System.out.println(Arrays.toString(freq));
        return arr;
    }
}