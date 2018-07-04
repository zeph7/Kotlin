//function can be used as an expression to directly return a value without return statement

fun main(args: Array<String>){
    var largeValue = max(4, 6)
    println("greater no.= $largeValue")
}

fun max(a: Int, b: Int): Int = if (a > b){
    println("$a is greater")
    a       //returns the last statement from a codeblock
}else{
    println("$b is greater")
    b       //returns the last statement from a codeblock
}