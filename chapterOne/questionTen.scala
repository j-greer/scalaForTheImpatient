/**
  * Created by jonathangreer on 13/11/2016.
  */

//What do the take, drop, takeRight, and dropRight string functions do?
// What advantage or disadvantage do they have over using substring?

"hello".take(2) // return first two letters of a string - he

"hello".drop(2) // return letters after the first two letters of a string - llo

"hello".takeRight(2) // same as take but starting from the end of the word - lo

"hello".dropRight(2) // same as drop but starting from the end of the word - hel

/* the substring method allows us to specify the number of characters returned
   "hello".substring(1,3).
 */