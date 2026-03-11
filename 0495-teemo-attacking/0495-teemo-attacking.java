class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total=0;

        for(int i=0;i<timeSeries.length-1;i++)
        {
            int d=duration;
            int temp=timeSeries[i];
            while(d>0&&temp<timeSeries[i+1])
            {
                total++;
                temp++;
                d--;
            }
        }
        return total+duration;
    }
}