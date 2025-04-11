class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
         Set <String> set=new HashSet<>();
        for(String word:words)
        {
            String temp="";
                for(int i=0;i<word.length();i++)
                {
                        temp+=morse[word.charAt(i)-'a'];
                }
            set.add(temp);
        }
      
        return set.size();
    }
}