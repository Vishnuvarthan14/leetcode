class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // int max=-1;
        // int zero=0;
        // for(int i : flowerbed)
        // {
        //     zero++;
        //     if(i==1)
        //     {
        //         zero=0;
        //     }
        //     max=max<zero?zero:max;
        // }
        // if(max==arr.length)
        // return true;

        // if(n==1)
        // return (max-2)>=n?true:false;
        // else
        // {
        //     int space=max-2;
        //     if(n*2-1<=space)
        //     return true;
        // }

        // return false;

        int count = 0;
        int len = flowerbed.length;
        
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == len - 1 || flowerbed[i + 1] == 0)) {
                
                flowerbed[i] = 1; // Plant a flower
                count++;
                
                if (count >= n)
                    return true;
            }
        }
        
        return count >= n;
    }
}