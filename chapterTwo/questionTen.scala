/**
  * Created by jonathangreer on 20/11/2016.
  */

/*
Write a function that computes x^n , where n is an integer. Use the following
recursive definition

   x^n = y^2 if n is even and positive, where y = x^n/2
   x^n = x*x^n-1 if n is odd and positive
   x^0 = 1
   x^n = 1 / x^-n is negative
 */

import scala.math.pow

def myFunction(x: Double, n: Int): Double = {
  if (n== 0){
    1
  }
  else if (n > 0){
    if (n % 2 == 0){
      myFunction(x, n/2) * myFunction(x, n/2)
    }
    else x * myFunction(x, n - 1)
  }
  else 1 / myFunction(x, -n)
}
