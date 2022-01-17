import scala.io.StdIn.{readLine, readInt}

object StudentObject{
    def main(args: Array[String]) = {
        print("Input student name: ");
        var name = readLine();
        print("Input student gender: ");
        var gender = readLine();
        print("Input student grade: ");
        var grade = readInt();
        var s = new student(name, gender, grade);
        println("Name of student: " + s.name)
        println("Gender of student: " + s.gender)
        println("Grade of student: " + s.grade)
    }
}

class student(val nameStudent:String, val genderStudent:String, val gradeStudent: Int){
    var name: String = nameStudent;
    var gender: String = genderStudent;
    var grade: Int = gradeStudent;        
}