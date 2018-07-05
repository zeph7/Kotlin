//since String class has no function for concatenation of strings
//and we are going to add a function for "adding strings" to the -> String Class


fun main(args: Array<String>){

    var str1: String = "John"
    var str2: String = "Snow"
    var str3: String = "Hey"

    println(str3.add(str1, str2))

    //calling add function from String Class by the use of str3 which is an object of String class
}

//now this extension function add() is a part of String Class
fun String.add(s1: String, s2: String): String{

    return this+s1+s2
}

//this keyword is actually referring to str3