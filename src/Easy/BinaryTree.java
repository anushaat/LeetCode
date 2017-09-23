package Easy;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree {
	TreeNode root;
	
	public BinaryTree(){
		root = null;
	}
	
	public void insert(int data){
		root = insertNode(root, data);
	}
	
	public TreeNode insertNode(TreeNode root, int data){
		if(root == null){
			root = new TreeNode(data);
		}else if(data < root.data){
			root.left = insertNode(root.left, data);
		}else{
			root.right = insertNode(root.right, data);
		}
		
		return root;
	}     
	
	
	public void inOrder(){
		inOrderTrav(root);
	}
	
	public void inOrderTrav(TreeNode root){
		if(root != null){
			inOrderTrav(root.left);
			System.out.println(root.data);
			inOrderTrav(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		
		tree.inOrder();
	}

}
