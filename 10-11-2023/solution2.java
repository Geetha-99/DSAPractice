

/*
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       Node temp=head;
       int count=1;
       while(temp.next!=null){
           temp=temp.next;
           count++;
       }
       int x=1;
       temp=head;
       int n=(int)Math.ceil((double)count/k);
       while(temp.next!=null && x<n){
           temp=temp.next;
           x++;
       }
       return  temp.data;
    }
}
