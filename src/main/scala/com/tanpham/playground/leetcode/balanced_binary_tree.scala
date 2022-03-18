package com.tanpham.playground.leetcode

object balanced_binary_tree extends App {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
     var value: Int = _value
     var left: TreeNode = _left
     var right: TreeNode = _right
  }
  def isBalanced(root: TreeNode): Boolean = {
    var isBalance = true
    def getHeight(root: TreeNode): Int = {
      if (root == null) return 0
      val leftHeight = getHeight(root.left)
      val rightHeight = getHeight(root.right)
      // println(s"${leftHeight} vs ${rightHeight}")
      if (scala.math.abs(leftHeight - rightHeight) > 1) {
        isBalance = false
      }
      return scala.math.max(leftHeight, rightHeight) + 1
    }
    getHeight(root)
    isBalance
  }
}
