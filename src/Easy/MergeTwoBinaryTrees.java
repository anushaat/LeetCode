package Easy;



public class MergeTwoBinaryTrees {
	
	public static TreeNode mergeTrees(TreeNode treeA, TreeNode treeB){
		
		if(treeA == null && treeB == null){
			return null;
		}
		
		int val = (treeA == null ? 0 : treeA.data) + (treeB == null ? 0 : treeB.data);
		TreeNode newNode = new TreeNode(val);
		
		newNode.left = mergeTrees(treeA == null ? null : treeA.left , treeB == null ? null : treeB.left);
		newNode.right = mergeTrees(treeA == null ? null : treeA.right , treeB == null ? null : treeB.right);
		
		return newNode;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree1 = new BinaryTree();
		tree1.insert(1);
		tree1.insert(3);
		tree1.insert(2);
		tree1.insert(5);
		
		BinaryTree tree2 = new BinaryTree();
		tree2.insert(2);
		tree2.insert(1);
		tree2.insert(3);
		tree2.insert(4);
		tree2.insert(7);

	}

}
