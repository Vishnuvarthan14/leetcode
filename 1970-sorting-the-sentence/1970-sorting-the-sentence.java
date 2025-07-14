class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");

        HashMap <Integer,String> map = new HashMap<>();

        for(String st:arr)
        {
            int n=st.length();
            map.put(st.charAt(n-1)-'0',st.substring(0,n-1));
        }

        String ans="";

        for(int i=1;i<=arr.length;i++)
        {
            ans+=map.get(i)+" ";
        }
        return ans.trim();
    }
}