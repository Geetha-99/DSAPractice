

//User function Template for Java
//O(N)

class Solution {
    int findMaximum(int[] arr, int n) {
        for(int i=1;i<n-1;i++){
           if(arr[i] > arr[i-1] && arr[i]>arr[i+1]){
               return arr[i];
           } 
        }
        return arr[n-1];
        
    }
}



//TC=O(logN)


class Solution {
    int findMaximum(int[] arr, int n) {
        int s=1; int e=n-2;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid]>arr[mid-1]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return arr[s];
        
    }
}
