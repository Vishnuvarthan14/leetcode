class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        return 1;
        int len = 0;
        int temp=n;
        while (n > 0) {
            len++;
            n >>= 1;
        }
        n=temp;
       // System.out.println(len);
        for(int i=0;i<len;i++)
        { 
            int pointer = 1<<i;
            n=n^pointer;
            //System.out.println(n);
        }
        return n;
    }
}