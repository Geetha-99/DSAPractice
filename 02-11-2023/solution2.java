

// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int i;
        for(i=1;i<=n;i++){
            if(i>n-1||array[i-1]!=i) break;
        }
        return i;
    }
}


//without sorting


class Solution {
    int missingNumber(int array[], int n) {
       int ans=0;
        for(int x:array){
            ans=ans^x;
        }
        for(int i=1;i<=n;i++){
            ans=ans^i;
        }
        return ans;
    }
}
