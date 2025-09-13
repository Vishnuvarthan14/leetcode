class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet<>();

        while(n!=1)
        {
            if(set.contains(n))
            return false;
            
            set.add(n);
            int num=n;
            int sum=0;
            while(num!=0)
            {
                sum+=((num%10)*(num%10));
                num/=10;
            }
            n=sum;
        }

        return true;
    }
}