import scala.collection.mutable.ArrayBuffer

/*
8. Rewrite the example at the end of Section 3.4, “Transforming Arrays,”
on page 34 using the drop method for dropping the index of the first match. Look the method up in Scaladoc.

Given a sequence of integers, we want to remove all but the first negative number
drop is postitional
 */

def transformArray(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
  val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
  val indexDrop = indexes.drop(1)
  for ( i <- (0 until indexDrop.length).reverse) a.remove(indexDrop(i))
  a
}