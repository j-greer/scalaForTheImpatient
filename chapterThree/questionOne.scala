/*
1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 */

import scala.util.Random

def snippet(n: Int): Array[Int] = {

  val a = new Array[Int](n)
  for (elem <- a) yield Random.nextInt(n)
}