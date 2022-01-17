import scala.io.StdIn.readInt;

object EvenOdd extends App{
    // print("Input Number= ")
    // var x = readInt()
    if(args(0).toInt %2 == 0){
        println("It is Even")
    }else{
        println("It is Odd")
    }
}