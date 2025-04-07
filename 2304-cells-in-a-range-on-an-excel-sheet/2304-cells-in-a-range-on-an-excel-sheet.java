class Solution {
    public List<String> cellsInRange(String s) {
        List <String> list = new ArrayList<>();
        char start=s.charAt(0);
        char end=s.charAt(3);

        int val1=s.charAt(1)-'0';
        int val2=s.charAt(4)-'0';
        for(int i=0;i<=end-start;i++)
        {
           // System.out.println((char)(start+i));
            for(int j=val1;j<=val2;j++)
            {
                String res=(char)(start+i)+"";
                res+=(char)('0'+j);
                    list.add(res);
            }
        }
        return list;
    }
}