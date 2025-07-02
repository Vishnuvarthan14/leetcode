class Solution {
    public int numberOfSteps(int num) {
        return check(num,0);
    }
    public int check(int num,int count)
    {
        if(num==0)
            return count;

        if(num%2==0)
            return check(num/2,count+1);
        
            return check(num-1,count+1);
    }
}