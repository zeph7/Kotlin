fun main(args: Array<String>){

    var obj = Person2()     //object obj of class Person is made
    obj.name = "Zephyr"         //name variable is referenced by the help of obj

    println("The name of the person is " + obj.name)
        //Or use string interpolation as by ${}
    print("The name of the person is ${obj.name}")

}

class Person2{

    var name = ""
}