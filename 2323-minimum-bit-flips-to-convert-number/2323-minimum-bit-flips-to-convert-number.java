class Solution {
    public int minBitFlips(int start, int goal) {
        int flipval = start^goal;
        int count=0;
        while(flipval!=0)
        {
            flipval=flipval&(flipval-1);
            count++;
        }

        return count;
    }
}