package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  printSet(singletonSet(1))
  printSet(union(singletonSet(1), singletonSet(3)))
}
