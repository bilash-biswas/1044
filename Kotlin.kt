import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.nextInt()
    var b = read.nextInt()
    if(a % b == 0 || b % a == 0)
    {
        println("Sao Multiplos");
    }
    else
    {
        println("Nao sao Multiplos");
    }
}

    
