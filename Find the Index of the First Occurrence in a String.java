class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        int l=len;
        int n=haystack.length();
        int ans=-1;
        for(int i=0;i<(n-(l-1));i++)
        {
            if((haystack.substring(i,len)).equals(needle))
            {
               ans=i;
               break;
            }   
                
            len=len+1;
             
        }
        return ans;
    }
}