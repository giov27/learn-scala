import scala.io.StdIn.readInt;

object Alghorithm2{
    def main(args: Array[String]): Unit = {
        var x, y = 0;

        print("Number of stars = ");
        val number = readInt();
        for(x <- 1 to number){
            for(y <- 1 to x){
                if(y == x || x == number || y == 1){
                    print("*");
                }else{
                    print(" ");
                }
            }
            println()
        }

    }
}