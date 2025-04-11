class Solution {
    public String reverseVowels(String s) {
        
        char arr[] = s.toCharArray();
        int start=0;
        int end=s.length()-1;
        String vowels="aeiouAEIOU";
        while(start<end)
        {
            if(vowels.indexOf(arr[start])!=-1&&vowels.indexOf(arr[end])!=-1)
            {
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            if(vowels.indexOf(arr[start])==-1)
            start++;
            if(vowels.indexOf(arr[end])==-1)
            end--;
        }
    //System.out.println(Arrays.toString(arr));
        return String.valueOf(arr);
    }
}