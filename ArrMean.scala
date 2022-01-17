object ArrMean{
    def main(args: Array[String]):Unit = {
        var arr1 = Array(1,2,3,4,5);
        var arr2:Array[Int] = new Array[Int](4);
        var arr3 = new Array[Int](4);
        var arr4 = new Array[Int](4);

        var x = 0;
        var res1 = 0
        //Average of arr1
        for(x <- arr1){
            res1 += x;
        }
        println("Average of arr1: " + res1/arr1.length);

        //Average of arr2
        var y = 0
        var res2 = 0
        for(x <- 5 to 9; y <- 0 to 3){
            arr2(y) = x;
        }

        for(x <- arr2){
            res2 += x;
        }
        println("Average of arr2: " + res2/arr2.length);

        //Avergae of arr3 & arr4
        var z = 0
        var res3 = 0
        var res4 = 0
        for(x <- 10 to 13; y <- 3 until 6; z <- 0 to 3){
            arr3(z) = x;
            arr4(z) = y;
        }

        for(x <- arr3 ; y <- arr4){
            res3 += x;
            res4 += y;
        }
        println("Average of arr3: " + res3/arr3.length);
        println("Average of arr4: " + res4/arr4.length);
    }
}