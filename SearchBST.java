/*
Given the reference to the root of a binary search tree and a search value, return the reference to the node that contains the value if it exists and null otherwise.
Note: all values in the binary search tree will be unique.

Ex: Given the tree...

        3
       / \
      1   4
and the search value 1 return a reference to the node containing 1.

Ex: Given the tree

        7
       / \
      5   9
         / \ 
        8   10
and the search value 9 return a reference to the node containing 9.

Ex: Given the tree

        8
       / \
      6   9
and the search value 7 return null.

Problem URL: 
*/
import java.util.*;

class SearchBST{
	public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val)
            return root;
        else if(root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }	
}
