class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int arr1[] = new int[1001];
        int arr2[] = new int[1001];

        for(int i:nums1)
            arr1[i]=1;
         for(int i:nums2)
            arr2[i]=1;

       List <Integer> list = new ArrayList<>();

       for(int i=0;i<1001;i++)
        {
            if(arr1[i]==1&&arr2[i]==1)
                list.add(i);
        }
       int common[] = new int[list.size()];

       for(int i=0;i<list.size();i++)
        common[i]=list.get(i);
        
        return common;
    }
}