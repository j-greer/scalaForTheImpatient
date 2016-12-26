/*
Write a loop that swaps adjacent elements of an array of integers.
For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 */

val a = Array(1, 2, 3, 4, 5)

for (i <- 1 until a.length if i % 2 !=0){
  val one = a(i)
  val two = a(i-1)

  a(i) = two
  a(i-1) = one
}




