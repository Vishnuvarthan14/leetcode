class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int ones=0;
       for(char c:s.toCharArray())
        {
            if(c=='1')
            ones++;
        }
        int zeros=n-ones;

        StringBuilder str = new StringBuilder();
        int i=1;
        while(i<ones){
            str.append(1);
            i++;}
            i=0;
        while(i<zeros){
            str.append(0);
            i++;}

        return new String(str.append(1));
    }
}