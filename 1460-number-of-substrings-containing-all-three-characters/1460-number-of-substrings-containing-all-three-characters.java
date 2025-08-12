class Solution {
    public int numberOfSubstrings(String s) {
        
        int arr[] = new int[3];
        Arrays.fill(arr,-1);
        int j=0,count=0;

        while(j<s.length())
        {
            char c=s.charAt(j);

                arr[c-'a']=j;
            if(arr[0]>-1&&arr[1]>-1&&arr[2]>-1)
            {
                int min=arr[0];
                for(int i=0;i<3;i++)
                {
                    if(min>arr[i])
                        min=arr[i];
                }
                count+=(min+1);
            }
            j++;
        }
        return count;
    }
}