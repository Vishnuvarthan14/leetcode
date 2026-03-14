class Solution {
    List <String> list =new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate("",0,0,n);
        return list;
    }
    public void generate(String ans,int i,int j,int n)
    {
        // System.out.println(ans);
        // System.out.println(i+"  "+j);


        if(i==n&&j==n)
        {
           list.add(ans);
            return;
        }

        if(i<n)
            generate(ans+'(',i+1,j,n);
        if(j<i)
            generate(ans+")",i,j+1,n);
        
    }
}