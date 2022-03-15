package com.tanpham.playground.leetcode

object reverse_bits extends App {
  // you need treat n as an unsigned value
  def reverseBits(x: Int): Int = {
    // var tmp = x
    // var intToStr = ""
    // var count = 0
    // while (tmp > 0 || count < 32) {
    //     val mod = tmp % 2
    //     println(mod)
    //     intToStr = intToStr + mod
    //     tmp = tmp / 2
    //     count += 1
    // }
    // println(intToStr)
    // Integer.parseInt(intToStr,2)
    var tmp = x
    var i: Int = 0
    var ans: Int = 0
    while (i < 32) {
      ans = ans << 1
      ans += tmp & 1
      println(tmp & 1)
      tmp = tmp >> 1
      // print(ans)
      // println(tmp)
      i += 1
    }
    ans
  }
//  println(reverseBits(Integer.parseInt("01111111111111111111111111111111",2)))
  assert(reverseBits(Integer.parseInt("00000010100101000001111010011100",2)) == 964176192)
}
