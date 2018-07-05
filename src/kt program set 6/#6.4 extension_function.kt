//to add a new function to the existing /predefined class without declaring it inside the class
//the new function behaves just like static function in case of java

fun main(args: Array<String>){
    var student = Student()
    println("Pass status: " + student.hasPassed(57))
    println("Scholarship status: " + student.isScholar(57))
}

// Extension Function (which is extended inside the class Student)
fun Student.isScholar(marks: Int): Boolean{
    return marks > 95
}


class Student{

    fun hasPassed(marks: Int): Boolean{
        return marks > 33
    }
}

//This is actually not the practical usage of Extension Function