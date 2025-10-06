class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum=0;
        int arr[] = new int[3];
        for(int i=0;i<garbage.length;i++)
        {
            String s=garbage[i];
            sum+=s.length();
            for(char c:s.toCharArray())
            {
                if(c=='M')
                arr[0]=i;
                else if(c=='P')
                arr[1]=i;
                else
                arr[2]=i;
            }

        }
        // System.out.printf("M=%d P=%d G=%d",arr[0],arr[1],arr[2]);
       // System.out.println(sum);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i];j++)
                sum+=travel[j];
        }
        return sum;
    }
}