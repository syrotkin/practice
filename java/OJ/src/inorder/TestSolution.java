package inorder;

import java.util.Stack;



public class TestSolution {

	public static void main(String[] args) {
		TreeNode node1 = createTree1();
		//recursiveInorder(node1);
		inorder(node1);
	}

	private static void inorderWRONG(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode node = root;
		while (!stack.isEmpty()) {
			while (node.left != null) {
				node = node.left;
				stack.push(node);
			}
			printStack(stack);
			node = stack.pop();
			System.out.println(node.val);
			while (node.right != null) {
				node = node.right;
				stack.push(node);
			}
		}
	}
	
	// From Wikipedia
	private static void inorder(TreeNode node) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			}
			else {
				node = stack.pop();
				System.out.println(node.val);
				node = node.right;
			}
			
		}
	}
	
	private static void printStack(Stack<TreeNode> stack) {
		System.out.print("Stack: ");
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.elementAt(i).val + ", ");
		}
		System.out.println();
	}

	private static void recursiveInorder(TreeNode root) {
		
		if (root == null) {
			return;
		}
		recursiveInorder(root.left);
		System.out.println(root.val);
		recursiveInorder(root.right);
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
}
