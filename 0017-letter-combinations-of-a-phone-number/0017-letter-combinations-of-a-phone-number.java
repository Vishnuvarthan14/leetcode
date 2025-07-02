class Solution {
    public List<String> letterCombinations(String digits) {
        
        return numPad("",digits);
        
    }

    public List<String> numPad(String p,String up)
    {

        if(up.length()==0)
        {
            
            List <String> list = new ArrayList<>();
            if(p.length()!=0)
            list.add(p);
            return list;
        }
        int n=up.charAt(0)-'0';
        List <String> list = new ArrayList<>();

        if(n>=2&&n<=6)
        {
            for(int i=(n-2)*3;i<(n-1)*3;i++)
            {
                char temp=(char)('a'+i);
                list.addAll(numPad(p+temp,up.substring(1)));
            }
        }
       else if(n==7)
        {
            for(int i=15;i<19;i++)
            {
                char temp=(char)('a'+i);
                list.addAll(numPad(p+temp,up.substring(1)));
            }
        }
        else if(n==8)
        {
            for(int i=19;i<22;i++)
            {
                char temp=(char)('a'+i);
                list.addAll(numPad(p+temp,up.substring(1)));
            }
        }
        else if(n==9)
        {
            for(int i=22;i<26;i++)
            {
                char temp=(char)('a'+i);
               list.addAll(numPad(p+temp,up.substring(1)));
            }
        }

        return list;

    }
 }