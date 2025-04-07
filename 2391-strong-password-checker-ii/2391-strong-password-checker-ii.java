class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean length=(password.length()>=8)?true:false;
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean spl=false;
        boolean adj=true;

        for(int i=0;i<password.length();i++)
        {
            char c=password.charAt(i);
            if(c>='A'&&c<='Z')
                upper=true;
            else if(c>='a'&&c<='z')
                lower=true;
            else if(c>='0'&&c<='9')
                digit=true;
            else if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='-'||c=='+')
                spl=true;

            if((i+1)<password.length()&&password.charAt(i)==password.charAt(i+1)){
                    adj=false;
                    //System.out.printf("%c %c\n",password.charAt(i),password.charAt(i+1));
                    }
        }

        return (length&&upper&&lower&&digit&&spl&&adj);
    }
}