class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        int ind=0;
        for(int i:s)
        {
            if(ind<g.length&&g[ind]<=i)
            {
                count++;
                ind++;
            }
        }
        return count;
    }
}