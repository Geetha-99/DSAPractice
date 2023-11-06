

//User function Template for Java
class Solution
{
    public void transpose(int n,int a[][])
    {
        int t[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
                // t[j][i]=a[i][j];
            }
        }
    }
}
