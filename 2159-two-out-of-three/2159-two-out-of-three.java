class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List <Integer> list = new ArrayList<>();
        
        int arr1[]=new int[101];
         int arr2[]=new int[101];
          int arr3[]=new int[101];

            for(int i:nums1) arr1[i]=1;
            for(int i:nums2) arr2[i]=1;
            for(int i:nums3) arr3[i]=1;


            for(int i=1;i<101;i++)
            {
                int count=0;

                if(arr1[i]==1) count++;
                 if(arr2[i]==1) count++;
                  if(arr3[i]==1) count++;

                  if(count>=2)
                    list.add(i);
            }


        return list;
    }
}