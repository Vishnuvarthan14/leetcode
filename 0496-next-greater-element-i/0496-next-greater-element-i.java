class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];

        Stack <Integer> stack = new Stack<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i:nums2)
        {
            if(stack.isEmpty())
                stack.push(i);
            else
            {
                while(!stack.isEmpty()&&i>stack.peek())
                {
                    map.put(stack.peek(),i);
                    stack.pop();
                }
                stack.push(i);
            }
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
                arr[i]=map.get(nums1[i]);
            else
                arr[i]=-1;

        }

        return arr;
    }
}