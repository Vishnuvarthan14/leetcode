import java.util.SortedMap;
import java.util.TreeMap;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        SortedMap <Integer,Integer> map =new TreeMap<>();

        for(int i=0;i<nums1.length;i++)
        {
            int key=nums1[i][0];
                map.put(key,nums1[i][1]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            int key=nums2[i][0];
            if(map.containsKey(key))
                map.put(key,map.get(key)+nums2[i][1]);
            else
                map.put(key,nums2[i][1]);

        }
        int ans[][] = new int[map.size()][2];
        int ind=0;
        for(int key:map.keySet())
        {
            ans[ind][0]=key;
            ans[ind][1]=map.get(key);
            ind++;
        }
        return ans;
    }
}