

//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root){
     
        ArrayList<Integer>a=new ArrayList<>();
        preOrder(a,root);
        return a;
    }
    static void preOrder(ArrayList a,Node root){
        if(root==null)
        return;
        a.add(root.data);
        preOrder(a,root.left);
        preOrder(a,root.right);
    }

}
