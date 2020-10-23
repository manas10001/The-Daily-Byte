/*
Given an array of numbers sorted in ascending order, return a height balanced binary search tree using every number from the array. Note: height balanced meaning that the level of any node’s two subtrees should not differ by more than one.

Ex: nums = [1, 2, 3] return a reference to the following tree...
       2
      /  \
     1    3

Ex: nums = [1, 2, 3, 4, 5, 6] return a reference to the following tree...
        3
       / \
     2    5
    /   /  \
  1    4    6
  
Problem URL: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
*/

class SortedArrayToBST{
	public TreeNode helper(int[] nums, int l, int r){
        if(l > r)
            return null;
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, l, mid -1);
        root.right = helper(nums, mid + 1, r);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
}
