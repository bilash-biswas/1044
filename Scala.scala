object Main {
  def main(args:Array[String]){
    var Array(a,b) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
     if(a % b == 0 || b % a == 0)
    {
        println("Sao Multiplos")
    }
    else
    {
        println("Nao sao Multiplos")
    }
  }
}
