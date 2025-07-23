class Solution {
    public int countBinarySubstrings(String s) {
        char arr[] = s.toCharArray();
        ArrayList <Integer> list = new ArrayList();
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            
            if(arr[i]!=arr[i-1])
            {
                list.add(count);
                count=1;
            }
            else
                count++;
        }
        list.add(count);
        count=0;
        System.out.println(list);
       for(int i=0;i<list.size()-1;i++)
       {
        int a=list.get(i);
        int b=list.get(i+1);
         count+=Math.min(a,b);
       }    
        return count;
    }
}