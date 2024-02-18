class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
       int m=n;
        int count=0;
        String word="";
        int temp=-1;
         for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==' '){
                temp=0;
                break;
            }
        }
       if(temp==0)
       {
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
            else
            break;
        }
        
        for(int i=(n-count)-1;i>=0;i--)
        {    
             if((s.charAt(i))==' ')
            {
                 word=s.substring(i+1,n-count);
                break;
            }
            else{
                word=s.substring(0,n-count);
            }
        }
          m=word.length();
       }
        System.out.print(word);
      
        return m;
    }
}