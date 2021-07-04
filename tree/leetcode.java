// leetcode inorder traversal
 public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> myAns = new ArrayList<>();
        List<Integer> left = inorderTraversal(root.left);
        for(int ele : left) myAns.add(ele);
        myAns.add(root.val);
         List<Integer> right = inorderTraversal(root.right);
        for(int ele : right) myAns.add(ele);

        return myAns;
        
    }