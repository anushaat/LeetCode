package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargeValueInTreeRow {
	
	public static List<Integer> largestValues(TreeNode root) {
		//if(root==null) ;
		Queue<TreeNode> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		int large = Integer.MIN_VALUE;
		queue.add(root);
		int queueSize = root == null ? 0 : 1;
		while(!queue.isEmpty()){
			for (int i = 0; i < queueSize; i++) {
				root = queue.poll();
				large = Math.max(large, root.val);
				if(root.left!=null) queue.add(root.left);
				if(root.right!=null) queue.add(root.right);
			}
			list.add(large);
			queueSize = queue.size();
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(3);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(5);
		node.left.right = new TreeNode(3);
		node.right.right = new TreeNode(9);
		List<Integer> list = largestValues(node);
		for (Integer li : list) {
			System.out.println(li);
		}
	}

}
