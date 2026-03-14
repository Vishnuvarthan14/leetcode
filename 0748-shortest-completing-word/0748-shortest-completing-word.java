class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate=licensePlate.toLowerCase();

        int freq[] = new int[26];
        for(char c:licensePlate.toCharArray()){
            if(c>='a'&&c<='z')
            freq[c-'a']++;
}
        String ans="";
        int min=Integer.MAX_VALUE;
        for(String s:words)
        {
            if(min>s.length()&&check(freq,s)){
                min=s.length();
                ans=s;
            }
        }
        return ans;
    }

    public boolean check(int freq[],String s)
    {
        int arr[] = new int[26];
        for(char c:s.toCharArray())
            arr[c-'a']++;

        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                if(freq[i]>arr[i])
                return false;
            }
        }
        return true;
    }
}