class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String code[]=new String[words.length];
        int ind=0;
        for(String word:words)
        {
            String temp="";
                for(int i=0;i<word.length();i++)
                {
                        temp+=morse[word.charAt(i)-'a'];
                }
            code[ind++]=temp;
        }
       Set <String> set=new HashSet<>();
       for(String s:code)
            set.add(s);

        return set.size();
    }
}