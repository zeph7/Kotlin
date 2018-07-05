import sun.security.util.Length

/*Pure Kotlin Functionality, not supported in Java
So not Interoperable
Kotlin include a feature of naming the parameters of the function,
so that their position can be interchanged, but that doesn't
change anything
**/


fun main(args: Array<String>){
    findVol(length = 2, breadth = 3, height = 30)
    findVol(height = 30, length = 2, breadth = 3)
}

fun findVol(length: Int, breadth: Int, height: Int){
    println("length = $length")
    println("breadth = $breadth")
    println("height = $height")
}