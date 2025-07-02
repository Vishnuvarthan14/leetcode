class Solution {
    public int myAtoi(String s) {
        boolean digit = false;
        boolean minus = false;
        boolean signSeen = false;
        long sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!digit && !signSeen && c == ' ') {
                continue;
            }
            if (c == '+' || c == '-') {
                if (digit || signSeen) break; 
                signSeen = true;
                if (c == '-') minus = true;
                continue;
            }
            if (c >= '0' && c <= '9') {
                digit = true;
                sum = sum * 10 + (c - '0');
                if (!minus && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (minus && -sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }

            else break;

            System.out.println(sum);
        }

        if (minus)
             sum *= -1;

        return (int) sum;
    }
}
