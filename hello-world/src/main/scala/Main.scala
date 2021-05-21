import com.phasmidsoftware.flog.Flog

@main def hello: Unit =
  val sb = StringBuilder()
  val flog: Flog = Flog(sb)
  import flog._
  println("test" !! "Hello world!")
  println(msg)
  println(flog.toString)

def msg = "I was compiled by Scala 3. :)"
