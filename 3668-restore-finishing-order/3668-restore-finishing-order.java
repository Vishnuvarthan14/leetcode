class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        int flag[] = new int[order.length+1];
        for(int i:friends)
            flag[i]=1;
        
        int j=0;
        for(int i=0;i<order.length;i++)
        {
            if(flag[order[i]]==1)
            {
                friends[j++]=order[i];
            }
        }

        return friends;
    }
}