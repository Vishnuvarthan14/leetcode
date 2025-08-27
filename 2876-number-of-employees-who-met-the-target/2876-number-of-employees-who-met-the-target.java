class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int i=0;
        int n=hours.length;
        for(i=0;i<n;i++)
        {
            if(hours[i]>=target)
                break;
        }
        return n-i;
    }
}