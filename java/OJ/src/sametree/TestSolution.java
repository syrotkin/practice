package sametree;



public class TestSolution {

	
	public static void main(String[] args) {
		TreeNode root1 = createTree1();
		TreeNode root2 = createTree1();
		TreeNode oneNode = new TreeNode(1);
		//dfs(oneNode);
		Solution s = new Solution();
		System.out.println(s.isSameTree(oneNode, null));
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

}
