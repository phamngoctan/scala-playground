package com.tanpham.playground.leetcode

object convert_sorted_array_to_binary_search_tree {

   // Definition for a binary tree node.
   class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
      var value: Int = _value
      var left: TreeNode = _left
      var right: TreeNode = _right
  }

  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    def buildTree(nums: Array[Int], left: Int, right: Int): TreeNode = {
      if (left > right) return null
      val mid = left + (right - left) / 2
      val node = new TreeNode(nums(mid))
      node.left = buildTree(nums, left, mid - 1)
      node.right = buildTree(nums, mid + 1, right)
      node
    }
    buildTree(nums, 0, nums.size - 1)
  }

  def sortedArrayToBST_betterVersion(nums: Array[Int]): TreeNode = {
    def buildTree(left: Int, right: Int): TreeNode = {
      if (left > right) return null
      val mid = left + (right - left) / 2
      val node = new TreeNode(nums(mid))
      node.left = buildTree(left, mid - 1)
      node.right = buildTree(mid + 1, right)
      node
    }
    buildTree(0, nums.size - 1)
  }
}
