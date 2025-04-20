class Solution {
    public boolean validMountainArray(int[] arr) {
        
       int max=-1;
       int ind=-1;
       for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
                {
                    max=arr[i];
                    ind=i;
                }
        }
        System.out.println(ind);
        boolean right=false;
        boolean left=false;
        for(int i=ind;i>0;i--)
        {
            right=true;
            if(arr[i]<=arr[i-1])
                return false;
        }
        
        for(int i=ind;i<arr.length-1;i++)
        {
            left=true;
            if(arr[i]<=arr[i+1])
                return false;
        }

        return right&&left;
    }
}