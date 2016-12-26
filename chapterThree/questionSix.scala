/*
How do you rearrange the elements of an Array[Int] so that they appear in
reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
 */

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting.quickSort

def reverseSortArray(a: Array[Int]): Array[Int] = {
  quickSort(a)
  a.reverse
}

def reverseSortArrayBuffer(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
  val aSorted = a.sorted
  aSorted.reverse
}