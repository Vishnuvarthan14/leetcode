class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[] = new int[s.length()];
        int n=s.length();
        int start=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                end=i;
                break;
            }
        }
        int i=0;
        while(i<n)
        {
            // System.out.println("s "+start);
            // System.out.println("e "+end);
         if(i==end)
           {
                start=end;
                end++;
                while(end<n&&s.charAt(end)!=c)
                {
                    end++;
                }
                if(end==n&&s.charAt(end-1)!=c)
                    end=0;
           }

           if(start==0&&s.charAt(start)!=c)
            arr[i]=Math.abs(i-end);
           else
           {
            int a=Math.abs(i-end);
            int b=Math.abs(start-i);
            if(a<b)
            arr[i]=a;
            else
            arr[i]=b;
           }
          i++;
        }
        return arr;
    }
}