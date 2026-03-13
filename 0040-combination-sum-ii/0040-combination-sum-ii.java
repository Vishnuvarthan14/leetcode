class Solution {
     List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      
      Arrays.sort(candidates);
        combination(candidates,target,0,new ArrayList<>(),0);
        return list;
    }
    public void combination(int arr[],int target,int sum,List<Integer> temp,int ind)
    {
        if(sum==target)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target)
        return;

        for(int i=ind;i<arr.length;i++){

            if(i > ind && arr[i] == arr[i-1])
                 continue;

            temp.add(arr[i]);
            combination(arr,target,sum+arr[i],temp,i+1);
            temp.remove(temp.size() - 1);
        }
    }
}