class Solution {
    public String reversePrefix(String s, int k) {
        int start=0;
        int end=k-1;

        char ch[] = s.toCharArray();
        while(start<end)
        {
            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }

        return new String(ch);
    }
}