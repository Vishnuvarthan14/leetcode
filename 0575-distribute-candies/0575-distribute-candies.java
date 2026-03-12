class Solution {
    public int distributeCandies(int[] candyType) {
        Set <Integer> set = new HashSet<>();
        int n=candyType.length;
        for(int i:candyType)
            set.add(i);
        
        if(set.size()>n/2)
            return n/2;
        return set.size();
    }
}