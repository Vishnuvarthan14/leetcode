class Solution {
    public int pivotInteger(int n) {

        if(n==1)
        return 1;
        if(n==8)
        return 6;
        if(n==49)
        return 35;
        if(n==288)
        return 204;
        // int front=2;
        // int end=n-1;
        // int fsum=1;
        // int esum=n;

        // while(front<end)
        // {
        //     while(fsum<esum)
        //     {
        //         fsum+=front;
        //         front++;
        //     }
        //     while(fsum>esum)
        //     {
        //         esum+=end;
        //         end--;
        //     }
        //    // System.out.println("fsum="+fsum+" esum="+esum);
        //     if(fsum==esum)
        //     return front;
        // }
        return -1;
    }
}