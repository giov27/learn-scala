import scala.io.StdIn.readInt
object TriangleArea{
    def main(args:Array[String])={
        println(area(10,5))
    }
    

    def area(height: Int, width: Int): Double = {
        height*width*0.5
    }
    
}