class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List <Integer> list = new ArrayList<>();
        int len=words[0].length();

        Arrays.sort(words);
         //System.out.println(Arrays.toString(words));
        int i=0,j=len*words.length;
        String[] parts = new String[words.length];;
        while(j<=s.length())
        {
           
            String part=s.substring(i,j);
            int ind=0;
            for (int k = 0; k < words.length; k++) {
                parts[k] = part.substring(k * len, (k + 1) * len);
            }
            Arrays.sort(parts);

            if(check(parts,words))
                list.add(i);
           i++;
           j++;
        }

        return list;
    }
    public boolean check(String[] list,String[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(!list[i].equals(arr[i]))
            {
                return false;
            }
            
        }
        return true;
    }
}