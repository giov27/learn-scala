object ConcatArr extends App{
    var tokoSebelah: Array[String] = Array[String]("Botol", "Gelas", "Piring")
    var tokoSaya: Array[String] = Array[String]("Handphone", "Laptop", "Monitor")

    var combine = tokoSebelah ++ tokoSaya
    println(combine.mkString(", "))
}