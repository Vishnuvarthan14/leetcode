class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ind=0;
        for(int i:s)
        {
            if(ind<g.length&&g[ind]<=i)
            {
                ind++;
            }
        }
        return ind;
    }
}