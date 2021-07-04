public class BinaryTree{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data = data;
            this.data = left;
            this.data = right;
        }
        Node(int data){
            this(data,null,null);
        }
    }
    public static void preOrder(Node root, ArrayList<Integer> ans){
        if(root == null) return;
    ans.add(root.data);
    preOrder(root.left, ans);
    preOrder(root.right, ans);
    }
     public static void inOrder(Node root, ArrayList<Integer> ans){
        if(root == null) return;
    inOrder(root.left, ans);
    ans.add(root.data);
    inOrder(root.right, ans);
    }
     public static void postOrder(Node root, ArrayList<Integer> ans){
        if(root == null) return;
    
    postOrder(root.left, ans);
    postOrder(root.right, ans);
    ans.add(root.data);
    }
    public static int size(Node node){
        if(node == null) return 0;
        int leftsize = size(node.left);
        int rightsize = size(node.right);
        return leftsize + rightsize +1;
//  return node == null ? 0 : size(node)

    }
    public static int max(Node node){
 if(node == null) return -(int)1e9;
        int leftmax = max(node.left);
        int rightmax = max(node.right);
        return Math.max(Math.max(leftmax, rightmax), node.data);
//  return node == null ? -(int) 1e9: Math.max(node.data,Math.max(max(node.left), max(node.right)));
    }
    public static int sum(Node node){
        if(node == null) return 0;
        int leftsum = sum(node.left);
        int rightsum = sum(node.right);
        return leftsum + rightsum + node.data;
        // return node == null ? 0: sum(node.left) + sum(node.rigt) + node.data;


    }
    //  height in term of edges return -1 and for height in term of node return 0
    public static int height(Node node){
        return node == null ? -1 : Math.max(height(node.left), height(node.right))+1;

    }
    public static int min(Node node){
 if(node == null) return (int)1e9;
        int leftmin = min(node.left);
        int rightmin = min(node.right);
        return Math.min(Math.min(leftmin, rightmin), node.data);
    }
    public static int Numberofleaves(Node node){

    }
    
}