//if is called an expression because it returns a value

//program for greater of two number

fun main(args: Array<String>){

    var a = 2
    var b = 5
    var maxValue: Int = if(a > b){
        println("a is greater")
        a
    }else{
        println("b is greater")
        b
    }
    //in a multiple lines of code under if or else, last statement will be returned

    println(maxValue)

}