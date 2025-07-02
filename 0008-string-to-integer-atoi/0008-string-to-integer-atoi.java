class Solution {
    public int myAtoi(String s) {
        boolean digit = false;
        boolean minus = false;
        boolean plus = false;
        boolean signSeen = false;
        long sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Skip leading spaces
            if (!digit && !signSeen && c == ' ') {
                continue;
            }

            // Handle sign
            if (c == '+' || c == '-') {
                if (digit || signSeen) break; // already saw digit or sign → invalid
                signSeen = true;
                if (c == '-') minus = true;
                if (c == '+') plus = true;
                continue;
            }

            // Handle digit
            if (c >= '0' && c <= '9') {
                digit = true;
                sum = sum * 10 + (c - '0');

                // Check for overflow
                if (!minus && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (minus && -sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }

            // Invalid character → stop parsing
            else break;

            System.out.println(sum);
        }

        if (minus) sum *= -1;

        return (int) sum;
    }
}
