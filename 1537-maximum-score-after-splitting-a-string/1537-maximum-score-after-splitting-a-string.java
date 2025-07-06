class Solution {
    public int maxScore(String s) {
        
        int zero=0;
        int one=0;

        int arr[] = new int[s.length()];
            int k=0;
        for(char c:s.toCharArray())
            arr[k++]=c-'0';

        for(int i=1;i<arr.length;i++)
            one+=arr[i];

        int i=0;
        int j=1;
        int max=-1;
        while(j<arr.length)
        {
            if(arr[i]==0)
                zero++;

            int ans=zero+one;
                max=max<ans?ans:max;
            
            if(arr[j]==1)
                one--;
            
            i++;
            j++;
        }
        return max;
    }
}