package chap15

import math.{E, Pi}

object Patterns {

  val v = Var("x")
  val expr = BinOp("+", Number(1), v)
  val expr1 = 1

  // Wild-card patterns
  expr match {
    case BinOp(_, _, _) => println(expr + " is a binary operation")
    case _ => println("It's something else")
  }

  // Constant patterns
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }

  // Variable patterns
  expr1 match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }

  val pi = math.Pi
  E match {
    case `pi` => "strange math? Pi = " + pi
    case _ => "OK"
  }
}