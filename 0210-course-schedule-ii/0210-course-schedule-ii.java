class Solution {
    public int[] findOrder(int n, int[][] pre) {
        
        ArrayList <ArrayList<Integer>> adjs = new ArrayList<>();
        for(int i=0;i<n;i++)
            adjs.add(new ArrayList<Integer>());
        for(int i=0;i<pre.length;i++)
        {
            adjs.get(pre[i][0]).add(pre[i][1]);
        }
       // System.out.println(adjs);
        int degree[] = new int[n];
        ArrayList <Integer> topo = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int in:adjs.get(i))
            degree[in]++;
        }
        Queue <Integer> q =new LinkedList<>(); 
        for(int i=0;i<n;i++)
            {
                if(degree[i]==0)
                    q.add(i);
            }

          //  System.out.println(Arrays.toString(degree));
            while(!q.isEmpty())
            {
                int temp=q.poll();
                topo.add(0,temp);

                for(int in:adjs.get(temp))
                {
                    degree[in]--;
                    if(degree[in]==0)
                    {
                        q.add(in);
                    }
                }
            }
            if(topo.size()!=n)
            return new int[0];
           // System.out.println(topo);
           int arr[] = new int[topo.size()];
           for(int i=0;i<topo.size();i++)
           {
            arr[i]=topo.get(i);
           }
        return arr;
    }
}