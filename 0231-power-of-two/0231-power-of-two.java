// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n<=0)
//             return false;
//         int check = n&(n-1);
//         return check==0?true:false;
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        
        return find(n);
    }
    public boolean find(int n)
    {
        if(n==1)
            return true;
        if(n%2==1)
            return false;
        
        return find(n/2);
    }
}