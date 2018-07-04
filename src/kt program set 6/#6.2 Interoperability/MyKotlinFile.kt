
//Calling a Java function from the Kotlin File and Vice Versa


fun main(args: Array<String>){
    var area = MyJavaFile.getArea(10, 5)
    println("area = $area")
}

fun add(a: Int, b: Int): Int{
    return a+b
}