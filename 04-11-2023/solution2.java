class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
        return false;
        char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=b1[i])
            return false;
        }
        return true;
    }
}
