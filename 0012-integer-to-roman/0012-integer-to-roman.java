class Solution {
    public String intToRoman(int num) {
        String M[]={"","M","MM","MMM"};
        String C[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String X[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String I[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};

        String roman="";

        roman+=M[num/1000];
        roman+=C[(num/100)%10];
        roman+=X[(num/10)%10];
        roman+=I[(num%10)];
        return roman;
    }
}