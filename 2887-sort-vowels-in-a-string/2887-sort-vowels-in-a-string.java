class Solution {
    public String sortVowels(String s) {
        ArrayList <Character> list = new ArrayList<>();
        char arr[] = s.toCharArray();

        for(char c:arr)
        {
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
                {
                    list.add(c);
                }
        } 
        Collections.sort(list);

        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i];
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
                {
                    arr[i]=list.get(j++);
                }
        }

        return new String(arr);
    }
}