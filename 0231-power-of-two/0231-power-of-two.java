class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        int check = n&(n-1);
        return check==0?true:false;
    }
}