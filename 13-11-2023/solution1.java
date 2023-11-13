

// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>a=new ArrayList<>();
        inorder(a,root);
        return a;
    }
    static void inorder(ArrayList a,Node root){
        if(root==null)
        return;
        inorder(a,root.left);
        a.add(root.data);
        inorder(a,root.right);
    }
}

