class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0,j=piles.length-2;

        int sum=0;
        while(i<j)
        {
            sum+=piles[j];
            j-=2;
            i+=1;
        }
        return sum;
    }
}