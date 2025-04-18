class Solution {
    public String stringHash(String s, int k) {
        
        String alp="abcdefghijklmnopqrstuvwxyz";
        int arr[] = new int[s.length()/k];
        int ind=0;
        String str="";
        for(int i=0;i<s.length();i+=k)
        {
            int sum=0;
           for(int j=i;j<k+i;j++)
           {
               sum+=alp.indexOf(s.charAt(j));
           }
           str+=alp.charAt(sum%26);
        }

        return str;
    }
}