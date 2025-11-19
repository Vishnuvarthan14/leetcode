class Solution {
    public int maximum69Number (int num) {
        int len =(int) Math.log10(num);

        int div =(int) Math.pow(10,len);
        int ans=0;
        boolean check=true;
        while(div!=0)
        {
            int rem = (num/div)%10;
            if(rem==6&&check){
             ans=ans*10+9;
             check=false;
             }
            else
               ans=ans*10+rem; 

            div/=10;
        }
        return ans;
    }
}