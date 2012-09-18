package questions100;
import others.TreeNode;
import java.util.*;

public class BinaryTreeInorderTraversal {
	
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		LinkedList<TreeNode> link = new LinkedList<TreeNode>();
		while(!link.isEmpty() || root != null)
		{
			while(root != null)
			{
				link.push(root);
				root = root.left;
			}
			
			root = link.pop();
			result.add(root.val);
			root = root.right;
		}
		
		return result;
    }
}
