class Solution {
    public int[] findArray(int[] pref) {
        int ans[] = new int[pref.length];

        int xor=pref[0];
        ans[0]=pref[0];
        for(int i=1;i<pref.length;i++)
        {
            ans[i]=xor^pref[i];
            xor^=ans[i];
        }
        return ans;
    }
}