

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       insertionSort(arr,arr.length);
  }
  //Function to sort the array using insertion sort algorithm.
  public  static void insertionSort(int arr[], int n)
  {
     for(int i=1;i<n;i++){
         int j=i-1;
         while(j>=0 && arr[j+1]<arr[j]){
            int a=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=a;
            j--;
         }
     }
  }
}
