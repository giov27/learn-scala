import scala.io.StdIn.{readInt, readLine};


object SelectionSort{
    def main(args: Array[String]) = {
        var sortArrange: String = "asc"
        print("Set the array length = ")
        var len = readInt()
        var arrInput = new Array[Int](len)
        println("arrIn" + arrInput.size)
        var i = 0
        for(i <- 0 until len){
            printf("Number %d = ", i+1)
            arrInput(i) = readInt()
        }
        print("Sort Arrengement : ")
        sortArrange = readLine()
        
        var arrengedSorted = sort(arrInput,sortArrange)
        println(arrengedSorted.mkString(" "))
    }

    def sort(arr: Array[Int], order: String): Array[Int] = {
        var swap: Boolean = true;
        var tmp, value, val_index = 0

        var j = 0
        for(j <- 0 until arr.length){
            value = arr(j)
            val_index = j
            swap = false
            var k  = 0
            for(k <- j+1 until arr.length){
                if(order == "desc"){
                    if(value < arr(k)){
                        value = arr(k)
                        val_index = k
                        swap = true
                    }
                }else{
                    if(value > arr(k)){
                        value = arr(k)
                        val_index = k
                        swap = true
                    }
                }
            }
            if(swap == true){
                tmp = arr(j)
                arr(j) = value
                arr(val_index) = tmp
            }
        }
        arr
    }
}