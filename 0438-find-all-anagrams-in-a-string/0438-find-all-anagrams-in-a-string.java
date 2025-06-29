class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> list = new ArrayList<>();
        if(p.length()>s.length())
            return list;
            
        int freq_p[] = new int[26];

        int k=p.length();
        for(char c:p.toCharArray())
        {
            freq_p[c-'a']++;
        }

        int freq_s[] = new int [26];
        
        for(int i=0;i<k;i++)
            freq_s[s.charAt(i)-'a']++;

        if(check(freq_s,freq_p))
            list.add(0);
        int i=0;
        int j=k;
        while(j<s.length())
        {
            freq_s[s.charAt(i)-'a']--;
            freq_s[s.charAt(j)-'a']++;

            if(check(freq_s,freq_p))
                list.add(i+1);
            i++;
            j++;
        }
        return list;
    }

    public static boolean check(int freq_s[],int[] freq_p)
    {
         for(int i=0;i<26;i++)
        {
            if(freq_s[i]!=freq_p[i])
            {
                return false;
            }
        }
        return true;
    }
}