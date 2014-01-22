package sametree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	Stack<TreeNode> pStack = new Stack<TreeNode>();
    	Set<TreeNode> pSet = new HashSet<TreeNode>();
    	Stack<TreeNode> qStack = new Stack<TreeNode>();
    	Set<TreeNode> qSet = new HashSet<TreeNode>();
    	
    	if (p == null && q == null) {
    		return true;
    	}
    	if ((p == null && q != null) || (p != null && q == null)) {
    		return false;
    	}
    	
    	pStack.push(p);
    	qStack.push(q);
    	while (!pStack.isEmpty() && !qStack.isEmpty()) {
    		TreeNode pNode = pStack.pop();
    		TreeNode qNode = qStack.pop();
    		if (pNode.val != qNode.val) {
    			return false;
    		}
    		pSet.add(pNode);
    		qSet.add(qNode);
    		
    		if (pNode.left != null) {
    			if (qNode.left == null) {
    				return false;
    			}
    			else {
    				if (!pSet.contains(pNode.left)) {
    					//pSet.add(pNode.left);
    					pStack.push(pNode.left);
    				}
    				if (!qSet.contains(qNode.left)) {
    					//qSet.add(qNode.left);
    					qStack.push(qNode.left);
    				}
    			}
    		}
    		
    		if (pNode.right != null) {
    			if (qNode.right == null) {
    				return false;
    			}
    			else {
    				if (!pSet.contains(pNode.right)) {
    					//pSet.
    					pStack.push(pNode.right);
    				}
    				if (!qSet.contains(qNode.right)) {
    					qStack.push(qNode.right);
    				}
    			}
    		}
    	}
    	
    	if (pStack.isEmpty() && qStack.isEmpty()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}