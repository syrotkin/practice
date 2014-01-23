package depthbinarytree;

import java.util.HashMap;
import java.util.Stack;

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int maxDepth = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		HashMap<TreeNode, Integer> marked = new HashMap<TreeNode, Integer>();
		stack.push(root);
		marked.put(root, 1);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			// marked.put(node, current);
			// System.out.println(node.val + ", " + marked.get(node));
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
			if (node.left == null && node.right == null) { // this is a leaf, evaluate depth
				int depth = marked.get(node);
				if (depth > maxDepth) {
					maxDepth = depth;
				}
			}
		}
		return maxDepth;
	}
	
	public int maxDepth2(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
	}
	
}  