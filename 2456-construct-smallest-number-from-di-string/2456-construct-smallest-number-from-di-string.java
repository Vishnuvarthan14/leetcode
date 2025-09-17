class Solution {
    public String smallestNumber(String pattern) {
       int n=pattern.length();
       char arr[] = new char[n+1];

       for(int i=0;i<=n;i++)
            arr[i]=(char)('1'+i);
       
       int i=0;
       while(i<n)
       {
        char c=pattern.charAt(i);
            if(c=='D')
                {
                    int ind=i;
                    while(i<n&&pattern.charAt(i)=='D')
                    {
                        i++;
                    }
                    reverse(arr,ind,i);
                }
                i++;
       }
       return new String(arr);

    }
    public void reverse(char arr[],int start,int end)
    {
        while(start<end)
        {
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}