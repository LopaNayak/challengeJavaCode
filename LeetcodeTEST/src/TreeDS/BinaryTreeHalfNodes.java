package TreeDS;
// count all half nodes in the tree. half nodes are nodes which hve just one child.
// 
public class BinaryTreeHalfNodes {
     TreeNode root;
     int counter = 0;
     
     int halfNodeCounter(BinaryTreeHalfNodes tn, TreeNode root)
     {
    	 //System.out.println("Root is"+root.val);
    	 TreeNode currNode = root;
    	 if(currNode != null)
    	 {
    		if( getKidsCount(currNode)==1)
    			counter += 1;
    		if(currNode.left != null)
    		halfNodeCounter(tn,currNode.left );
    		if(currNode.right != null)
    		halfNodeCounter(tn,currNode.right );
    	 }
    	 
    	 return counter;
     }
     
     int getKidsCount(TreeNode tr)
     {
    	 if(tr.left != null)
    		 if(tr.right!= null) return 2;
    		 else 
    		 {
    			//System.out.println("Node is "+tr.val); 
    			return 1;}
    	 else
    		 if(tr.right!=null)
    		 {
     			//System.out.println("Node is "+tr.val); 
     			return 1;}
    		 else return 0;
     }
	
	public static void main(String[] args)
	{
		//create the tree
		BinaryTreeHalfNodes tree = new BinaryTreeHalfNodes();
		tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(19);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);
        tree.root.right.left.right = new TreeNode(23);
        System.out.println("total half nodes: "+tree.halfNodeCounter(tree, tree.root));

	}
}
