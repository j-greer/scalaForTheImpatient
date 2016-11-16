//Write a function product(s : String) that computes the product, as described
//in the preceding exercises

def product(s: String) = {
  s.foldRight(1)((a,b) => a*b)
}