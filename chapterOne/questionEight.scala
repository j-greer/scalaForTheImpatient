/**
  * Created by jonathangreer on 13/11/2016.
  */

/*
One way to create random file or directory names is to produce a random BigInt and convert it to base 36,
yielding a string such as "qsnvbevtomcj38o06kul".
Poke around Scaladoc to find a way of doing this in Scala.
 */

import scala.util.Random

println(BigInt(scala.util.Random.nextInt()).toString(36))