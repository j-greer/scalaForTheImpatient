/*
3. Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield.
 */

def changeArray(a: Array[Int]): Array[Int] = {
  (for (i <- 0 until a.length)
    yield if (i % 2 == 0 & a.length - 1 == i) a(i) else if (i % 2 != 0) a(i-1) else a(i+1)).toArray
}

val a = Array(1,2,3,4,5)

changeArray(a)