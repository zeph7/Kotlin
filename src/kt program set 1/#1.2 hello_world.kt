/*
Kotlin is a JVM(Java Virtual Machine) Language, so it need JDK(Java Development Kit)
In Kotlin we don't need to declare class explictly(unlike Java)
So you can directly create a function by keyword 'fun'
*/
fun main(args: Array<String>){      //function defined as main function with arguments taken by it in Array of <String>,as denoted by this line
    println("Hello World!!")
    println(10 / 2)
    println(10.0 / 2)
    print(true)
}

//fun -> determine, its a function
//main -> its a main function or say method
//args -> variable name of type -> Array of <String>
//println -> prints the inside statement with a newline char added '\n'
//print function prints everything inside it
//if int value inside print-> gives integer o/p, else if float or boolean-> gives float/boolean o/p

/*
Kotlin is a JVM Language so it should demand class Files like Java, why it doesn't ?
Thats because Kotlin compiler internally creates a Class File which is loaded into memory for
execution in runtime (when converted into class files)
 */