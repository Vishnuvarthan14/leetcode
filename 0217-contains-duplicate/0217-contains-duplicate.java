import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for (int num : nums) {
            if (hmap.containsKey(num)) {
                return true;
            } else {
                hmap.put(num, 1); 
            }
        }
        
        return false; 

        // Set <Integer> set =new HashSet<>();

        // for(int i:nums)
        //     set.add(i);

        // if(set.size()!=nums.length)
        //     return true;

        //     return false;
    }
}
