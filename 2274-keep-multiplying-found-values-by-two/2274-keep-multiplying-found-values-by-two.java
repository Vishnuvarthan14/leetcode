class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList <Integer> list = new ArrayList<>();

        for(int i:nums) list.add(i);
        if(list.contains(original))
        original=list.get(list.indexOf(original))*2;
        else
            return original;

        while(list.contains(original))
        {
             original=list.get(list.indexOf(original))*2;
        }
        
        return original;
    }
}