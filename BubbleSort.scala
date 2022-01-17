import scala.io.StdIn.readInt;

object BubbleSort extends App{
    def sort(sortArray: Array[Int], sortArrange: String):Array[Int] = {
        var check: Boolean = true;
        var tmp: Int = 0;
        var j: Int = 0;

        while(check == true){
            check = false
            for(j <- 0 until sortArray.length-1){
                if(sortArrange == "asc"){
                    if(sortArray(j) > sortArray(j+1)){
                        tmp = sortArray(j);
                        sortArray(j) = sortArray(j+1);
                        sortArray(j+1) = tmp;
                        check = true;
                    }
                }else{
                    if(sortArray(j) < sortArray(j+1)){
                        tmp = sortArray(j);
                        sortArray(j) = sortArray(j+1);
                        sortArray(j+1) = tmp;
                        check = true;
                    }
                }
            }
        }
        sortArray        

    }

    var len: Int = 0
    var i: Int = 0 

    println("--Bubble Sort --")
    print("Set length of Array= ")
    len = readInt()
    var arr: Array[Int] = new Array[Int](len)
    for(i <- 0 until len){
        print("Array input: ")
        var inputArr = readInt()
        arr(i) = inputArr
    }
    println(arr.mkString(" "))
    var sortedArray = sort(arr, "asc")
    println(sortedArray.mkString(" "))

}