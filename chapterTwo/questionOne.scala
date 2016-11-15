/**
  * Created by jonathangreer on 13/11/2016.
  */

//The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
// Write a function that computes this value.


def Signum(n: Int): Int = {
  if (n > 0) 1 else -1
}

println(Signum(5))