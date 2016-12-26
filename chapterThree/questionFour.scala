/*
4. Given an array of integers, produce a new array that contains all positive values of the original array,
in their original order, followed by all values that are zero or negative, in their original order.
 */

def reorderArray(a: Array[Int]): Array[Int] = {
  val negative = a.filter(_ <= 0)

  val positive = a.filter(_ > 0)

  positive.union(negative)

}