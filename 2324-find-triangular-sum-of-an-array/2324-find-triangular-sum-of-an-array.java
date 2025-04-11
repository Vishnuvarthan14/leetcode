class Solution {
    public int triangularSum(int[] nums) {
        ArrayList <Integer> temp = new ArrayList<>();
        for(int i:nums) temp.add(i);

        
        while(temp.size()>1)
        {
              ArrayList <Integer> m = new ArrayList<>();
            for(int i=1;i<temp.size();i++)
            {
                m.add((temp.get(i)%10)+(temp.get(i-1)%10));
            }
           temp = new ArrayList<>(m);
        } 
        System.out.println(temp);
        return temp.get(0)%10;
        }
}