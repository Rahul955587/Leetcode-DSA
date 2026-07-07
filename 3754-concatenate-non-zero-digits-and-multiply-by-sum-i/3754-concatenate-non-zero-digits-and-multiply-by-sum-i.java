class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        long x = 0;
        int sum = 0;
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (digit != 0) {
                x = x * 10 + digit;
                sum += digit;
            }
        }
        return (x * sum);
    }
}