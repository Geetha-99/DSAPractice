

//User function Template for Java



//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root){
    ArrayList<Integer>a=new ArrayList<>();
        postorder(a,root);
        return a;
    }
    static void postorder(ArrayList a,Node root){
        if(root==null)
        return;
        postorder(a,root.left);
        postorder(a,root.right);
        a.add(root.data);
    }
}
