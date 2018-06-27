fun main(args: Array<String>){

    var obj = Person()     //object obj of class Person is made
    obj.name = "Zephyr"         //name variable is referenced by the help of obj
    obj.display(obj.name)       //display function is referenced by the help of obj

}

class Person {

    var name = ""
    fun display(name: String) {      //here name is argument and declares as String type
        print("My name is: " + name)
    }
}