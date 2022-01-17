import scala.io.StdIn.{readInt, readLine};


object Salary extends App{
    print("Employee Name: ")
    val name = readLine()
    print("Employee Grade: ")
    val grade = readLine()
    print("Employee Total Hours: ")
    val hours = readInt()
    val paidCategory = grade match{
        case "A" => 25000
        case "B" => 50000
        case "C" => 75000
        case _ => 25000
    }
    var salary = 0
    if(hours < 40){
      salary = hours*paidCategory;
    } else {
      salary = ((hours-40)*50000)+hours*paidCategory;
    }
    println("Hello, " + name+"!");
    println("This is your salary this week: " + salary);

}