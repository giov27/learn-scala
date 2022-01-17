object Sum2dArr extends App{
    val arr = Array(Array(10, 2), Array(12, 30))
    val arr2 = Array(Array(1, 25), Array(2,1))
    var arrRes = Array.ofDim[Int](2,2)
    var x, y = 0;
    for(x <- 0 until arr.length){
        for(y <- 0 until arr2.length){
            //println(arr(x)(y) + " " + arr2(x)(y))
            arrRes(x)(y) = arr(x)(y) + arr2(x)(y)
        }
    }
    println(arrRes(0).mkString(" "))
    println(arrRes(1).mkString(" "))

}