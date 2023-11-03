

//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> a= new ArrayList<Integer>();
        int s=0;
        int e=k;
        while (s<e && e<=n){
            int max=arr[s];
            for(int i=s;i<e;i++){
                max=Math.max(max,arr[i]);
            }
            a.add(max);
            s++;
            e++;
        }
        return a;
    }
}
