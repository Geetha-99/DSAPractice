

//User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
       if(q>2*n) return 0;
       return n-Math.abs(n+1-q);
    }
};
