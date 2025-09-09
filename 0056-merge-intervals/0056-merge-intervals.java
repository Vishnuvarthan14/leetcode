class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList <int[]> list=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int begin=intervals[i][0];
            if(begin>=start&&begin<=end)
            {
                end=Math.max(intervals[i][1],end);
            }
            else
            {
                int temp[]= {start,end};
                list.add(temp);
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
            int temp[]= {start,end};
                list.add(temp);

        
       return list.toArray(new int[list.size()][]);
    }
}