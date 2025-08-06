class Solution {
    ArrayList <ArrayList<Integer>> adjs = new ArrayList<>();
    public boolean canFinish(int n, int[][] pre) {
        
        for(int i=0;i<n;i++)
        {
            adjs.add(new ArrayList<Integer>());
        }

      for(int i=0;i<pre.length;i++)
      {
            adjs.get(pre[i][0]).add(pre[i][1]);
                         
      }

      int degree[] = new int[n];

      for(int i=0;i<adjs.size();i++)
      {
        for(int j=0;j<adjs.get(i).size();j++)
        {
            int ind=adjs.get(i).get(j);
            degree[ind]++;
        }
      }

      Queue <Integer> q = new LinkedList<>();
      for(int i=0;i<n;i++)
      {
        if(degree[i]==0)
            q.add(i);
      }

        int visited=0;
      while(!q.isEmpty())
      {
        int temp=q.poll();
        visited++;
        for(int i=0;i<adjs.get(temp).size();i++)
        {
            int ind=adjs.get(temp).get(i);
            degree[ind]--;
            if(degree[ind]==0)
                q.add(ind);
        }

      }
       
      return visited==n;
    }
}