// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        long a[]=new long[sum+1];
        a[0]=1;
        for(int i:coins){
            for(int j=i;j<=sum;j++){
                a[j]+=a[j-i];
            }
        }
        return a[sum];
    }
}
