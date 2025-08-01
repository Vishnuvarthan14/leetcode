class Solution {
        ArrayList <ArrayList<Integer>> adjs = new ArrayList<>();
        public void createAdjs(int n)
        {
            for(int i=0;i<n;i++){
                ArrayList <Integer> temp = new ArrayList<>();
                adjs.add(temp);}
        }
        public void populate(int u,int v)
        {
            adjs.get(u).add(v);
            adjs.get(v).add(u);
        }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
         
        Stack <Integer> stack = new Stack<>();
        boolean visited[] = new boolean[n];
        stack.push(source);

        createAdjs(n);

        for(int arr[] : edges)
        {
            populate(arr[0],arr[1]);
        }

        while(!stack.isEmpty())
        {
            int temp = stack.pop();

            if(temp==destination)
                return true;
            
            for(int i=0;i<adjs.get(temp).size();i++)
            {
                int val = adjs.get(temp).get(i);

                if(!visited[val])
                {
                    stack.push(val);
                    visited[val]=true;
                }
            }
            
        }
        return false;
    }
}