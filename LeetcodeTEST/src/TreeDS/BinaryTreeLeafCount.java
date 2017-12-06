package TreeDS;
//counts all the leaf nodes in the tree

class BinaryTreeLeafCount {
    int result = 0;
    TreeNode root;

    public int sumOfLeftLeaves(TreeNode proot) {
        if (proot == null) {
            System.out.println("the node inspecting is :"+proot.val+"and result = " + result);
            return result;
        } else if (proot.left == null )// leaf node
        {
            int x = result + proot.val;
            System.out.println("the node inspecting is :"+proot.val+"result" + x);
            return (x);
        } else {
                return (sumOfLeftLeaves(proot.left) + sumOfLeftLeaves(proot.right));
        }
    }


    public static void main(String[] args)
    {
        BinaryTreeLeafCount tree = new BinaryTreeLeafCount();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        System.out.println(tree.sumOfLeftLeaves(tree.root));

    }
}

// I.P of the binary tree appears like this: [3,9,20,null,null,15,7]// inorder traversal