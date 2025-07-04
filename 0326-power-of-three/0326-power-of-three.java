class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<=0)
        return false;

        return find(n);
    }

    public boolean find(int n)
    {
        if(n==1)
            return true;

        if(n<1||n%3!=0)
            return false;

          return  find(n/3);
    }
}