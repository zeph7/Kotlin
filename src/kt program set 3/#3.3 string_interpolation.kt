fun main(args: Array<String>){
    /*
    var name = "Sam"
    var str = "Hello " + name
    or instead you can use string interpolation by using $
    (dollar) sign followed by a single variable
    */
    var name = "Sam"
    var str = "Hello $name"
    println(str)

    println("The statement is $str. The no.of chars in it is ${str.length}")
    //string interpolation works only onto the next term after $ sign
    //so in $str.length, it will work only onto str
    //and instead, would have given the output -> Hello Sam.length

    var a = 10
    var b = 5
    println("The sum of $a and $b is ${a+b}")
    
}