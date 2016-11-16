//Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps
//Scaladoc.)

println("Hello".foldRight(1)((a,b) => a.toInt * b.toInt))