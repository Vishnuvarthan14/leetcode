class Solution {
    public char kthCharacter(int k) {
        String s="a";

        while(s.length()<k)
        {
            String temp="";

            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c=='z')
                    temp+='a';
                else
                    temp+=(char)(c+1);
            }
            s+=temp;
        }

        //System.out.println(s);
        return s.charAt(k-1);
    }
}