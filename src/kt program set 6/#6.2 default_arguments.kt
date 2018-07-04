import sun.security.util.Length

/*Java does not support default function, so there's a problem in interoperability, i.e. in calling
a default from a Kotlin file to Java file.
So you pass --> @JvmOverloads notation
This will make a Kotlin function compatible with Java file.
Used just above the function in a Kotlin File
*/

fun main(args: Array<String>){

    var result: Int
    result = findVolume(2,3)
    println(result)
    result = findVolume(2,3,5)
    println(result)

}

//height is a default argument with default value 10

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int{
    return length * breadth * height
}