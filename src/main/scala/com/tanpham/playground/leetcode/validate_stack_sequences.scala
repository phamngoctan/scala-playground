package com.tanpham.playground.leetcode

object validate_stack_sequences extends App {
  import scala.collection.mutable.Stack
  def validateStackSequences(pushed: Array[Int], popped: Array[Int]): Boolean = {
    val stack = new Stack[Int]()
    var (i, j) = (0, 0)
    while (i < pushed.size) {
      stack.push(pushed(i))
      while (j < popped.size && stack.size > 0 && stack.top == popped(j)) {
        j += 1
        stack.pop
      }
      i += 1
    }
    stack.isEmpty
  }

  assert(validateStackSequences(Array(1,2,3,4,5), Array(4,5,3,2,1)) == true)
  assert(validateStackSequences(Array(1,2,3,4,5), Array(4,3,5,1,2)) == false)
  assert(validateStackSequences(Array(1,0), Array(1,0)) == true)
}
