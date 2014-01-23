package depthbinarytree;

import java.util.HashMap;
import java.util.Stack;

public class TestSolution {

	
	public static void main(String[] args) {
		TreeNode node1 = createTree1();
		TreeNode node2 = createTree2();
		TreeNode oneNode = new TreeNode(1);
		//dfs(oneNode);
		Solution s = new Solution();
		System.out.println(s.maxDepth2(node1));
		System.out.println(s.maxDepth2(node2));
		System.out.println(s.maxDepth2(oneNode));
		System.out.println(s.maxDepth2(null));
	}
	/*
	 *         1
	 *   2          3
	 *4     5    7
	 *    6
	 */
	private static TreeNode createTree1() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(6);
		root.right.left = new TreeNode(7);
		return root;
	}
	
	/*
	 *      1
	 *   2     3
	 *       4   5
	 */
	private static TreeNode createTree2() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		
		return root;
	} 
	

	
	private static void dfs(TreeNode root) {
		int maxDepth = 0;
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		HashMap<TreeNode, Integer> marked = new HashMap<TreeNode, Integer>();
		stack.push(root);
		int current = 0;
		marked.put(root, current);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			//marked.put(node, current);
			System.out.println(node.val + ", " + marked.get(node));
			//if (node.left != null || node.right != null) {
			//	++current;
			//}
			if (node.left != null) {
				if (marked.get(node.left) == null) {
					stack.push(node.left);
					marked.put(node.left, marked.get(node) + 1);
				}
			}
			if (node.right != null) {
				if (marked.get(node.right) == null) {
					stack.push(node.right);
					marked.put(node.right, marked.get(node) + 1);
				}
			}
			if (node.left == null && node.right == null) { // this is a leaf
				// evaluate depth
				int depth = marked.get(node);
				if (depth > maxDepth) {
					maxDepth = depth;
				}
			}
		}
		System.out.println("max: " + maxDepth);
	}

}
