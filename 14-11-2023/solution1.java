

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer>a=new ArrayList<>();
        if(node==null) return a;
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            a.add(curr.data);
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }
        return a;
    }
}



