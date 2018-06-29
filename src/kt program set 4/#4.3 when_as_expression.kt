//when is called an expression as it also returns a value

fun main(args: Array<String>){

    val x = 1
    var str: String = when(x){
        1 -> "x is 1"
        2 -> "x is 2"
        else -> "x is an alien"
    }
    print(str)
}