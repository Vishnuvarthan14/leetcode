class Solution {
    public List<String> buildArray(int[] target, int n) {
        List <String> list = new ArrayList<>();
        int ind=0;
        int last=target[target.length-1];
        for(int i=1;ind<target.length&&i<=n;i++)
        {
            if(target[ind]==i){
                list.add("Push");
                ind++;
                }
            else
            {
                if(last>i)
                {
                    list.add("Push");
                    list.add("Pop");
                }
            }
            
        }
        return list;
    }
}