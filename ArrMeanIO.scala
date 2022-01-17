import scala.io.StdIn.readInt;

object ArrMeanIO{
    def main(args: Array[String]):Unit = {
        var arr = new Array[Int](5);
        var x = 0;
        var res:Double = 0.0

        for( x <- 0 to 4){
            printf("%d Value = ", x+1)
            arr(x) = readInt()
            res += arr(x)
        }
        println("Average of the numbers = " + res/arr.length);
    }
}