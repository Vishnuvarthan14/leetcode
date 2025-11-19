class Solution {
    public int removePalindromeSub(String s) {
        if(s.isEmpty())
        return 0;
        
        //System.out.println(palin(s.toCharArray()));
        if(palin(s.toCharArray()))
            return 1;

        return 2;

    }
    public boolean palin(char arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]!=arr[end])
            return false;
            start++;
            end--;
        }
        return true;
    }
}