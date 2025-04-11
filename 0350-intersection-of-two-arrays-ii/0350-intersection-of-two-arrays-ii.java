class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int arr1[]=new int[1001];
        int arr2[]= new int[1001];

        for(int i:nums1) 
            arr1[i]++;
        for(int i:nums2) 
            arr2[i]++;

        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<1001;i++)
        {
            if(arr1[i]!=0&&arr2[i]!=0)
            {
                for(int j=0;j<Math.min(arr1[i],arr2[i]);j++)
                {
                    list.add(i);
                }
            }
        }
        int arr3[]= new int[list.size()];
        for(int i=0;i<list.size();i++)
            arr3[i]=list.get(i);

            return arr3;

    }
}