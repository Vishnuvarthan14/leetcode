class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> list = new ArrayList<>();

        int max=-1;
        for(int i:candies)
        {
            if(max<i)
                max=i;
        }
        
        for(int i:candies)
        {
            if(i+extraCandies>=max)
                list.add(true);
            else
                list.add(false);
        }

        return list;
    }
}