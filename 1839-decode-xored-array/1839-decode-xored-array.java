class Solution {
    public int[] decode(int[] encoded, int first) {
        int arr[] = new int[encoded.length+1];

        int ind=0;
        arr[ind++]=first;
        for(int i=0;i<encoded.length;i++)
        {
            arr[ind]=arr[ind-1]^encoded[i];
            ind++;
        }

        return arr;
    }
}