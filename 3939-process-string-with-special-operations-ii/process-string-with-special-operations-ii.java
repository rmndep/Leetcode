class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n];
        long currLen = 0;
        long LIMIT = (long) 1e15;

        // First pass: compute length after each operation
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                currLen++;
            } else if (c == '*') {
                if (currLen > 0) currLen--;
            } else if (c == '#') {
                currLen = Math.min(LIMIT, currLen * 2);
            } else if (c == '%') {
                // length remains unchanged
            }

            len[i] = currLen;
        }

        // k is out of bounds
        if (k >= currLen) {
            return '.';
        }

        // Second pass: work backwards
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);

            long before = (i == 0) ? 0 : len[i - 1];
            long after = len[i];

            if (c >= 'a' && c <= 'z') {
                if (k == after - 1) {
                    return c;
                }
            } else if (c == '*') {
                // String before '*' had one extra character at the end.
                // If k points to a surviving character, it stays unchanged.
            } else if (c == '#') {
                if (before > 0 && k >= before) {
                    k -= before;
                }
            } else if (c == '%') {
                if (before > 0) {
                    k = before - 1 - k;
                }
            }
        }

        return '.';
    }
}