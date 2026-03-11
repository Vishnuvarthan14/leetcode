class Solution {
    public String[] findWords(String[] words) {
        String ans="";

        String s1 = "qwertyuiop";
        String s2 ="asdfghjkl";
        String s3 = "zxcvbnm";

        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int arr3[] = new int[26];

        fill(arr1,s1);
        fill(arr2,s2);
        fill(arr3,s3);

        for(String s:words)
        {
            String temp=s;
            s=s.toLowerCase();
            boolean check=true;
            if(arr1[s.charAt(0)-'a']==1)
            {
               // System.out.println("1 "+s);
                for(char c:s.toCharArray())
                {
                   // System.out.println(c);
                    if(arr1[c-'a']==0){
                        check=false;
                    break;}
                }
               
            }
            else if(arr2[s.charAt(0)-'a']==1)
            {
                //System.out.println("2 "+s);
                for(char c:s.toCharArray())
                {
                     //System.out.println(c);
                    if(arr2[c-'a']==0){
                    check=false;
                    break;}
                }
            }
            else{
                for(char c:s.toCharArray())
                {
                   // System.out.println("3 "+s);
                    if(arr3[c-'a']==0){
                    check=false;
                    break;}
                }
            }
        if(check)
        ans+=temp+" ";
        }
        if(ans.length()==0)
            return new String[]{};

        return ans.split(" ");
    }

    public void fill(int arr[],String s)
    {
        for(char c:s.toCharArray())
            arr[c-'a']++;
    }
}