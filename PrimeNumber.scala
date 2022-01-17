import scala.io.StdIn.readInt;


object PrimeNumber extends App{
    print("Starting number: ")
    var x: Int = readInt()

    do{      
      if (x == 2 || x == 3 || x == 5){
        println("Prime Number:" + x);
        x += 1;
      }else if (x%2 == 0 || x%3 == 0 || x%5 == 0 || x%7 == 0){
        x += 1;
      }else{
        println("Prime Number:" + x);
        x += 1;
      }
    }while(x<=100);
}