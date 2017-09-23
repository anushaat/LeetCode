package Medium;

public class ConvertBstToGreaterTree {
	static int sum = 0;
	public static TreeNode convertBST(TreeNode root) {
		convert(root);
		return root;
	}
	
	public static void convert(TreeNode root) {
		
		if(root==null) return;
		convert(root.right);
		root.val += sum;
		sum = root.val;
		convert(root.left);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(2);
		node.right = new TreeNode(13);
		convertBST(node);
		
		System.out.println(node.left.val + " " + node.val + " " + node.right.val);

	}

}
