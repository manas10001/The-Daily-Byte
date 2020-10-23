/*
Given two binary trees, return whether or not the two trees are identical.

        2		 2
       / \		/ \	
      1   3    1  3 
return true.

Ex: Given the following trees...

	1			1
	 \		   /
	  9		  9
	   \	  \
	   18	  18
return false.

Ex: Given the following trees...

        2		 2
       / \		/ \	
      1   3    3  1 
return false.   

Problem URL: https://leetcode.com/problems/same-tree/
*/
import java.util.*;

class IdenticalTrees{

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val)
            return isSameTree(p.left ,q.left) && isSameTree(p.right, q.right);
        
        return false;
    }
}
