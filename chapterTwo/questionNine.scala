//Make the function of the preceding exercise a recursive function.

def recursiveProduct(s: String): Int = {
  val tail = s.tail
  if (tail.size == 0){
    s.head
  }
  else {
    s.head * recursiveProduct(tail)
  }
}

