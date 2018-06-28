import com.shreks.Person3

fun main(args: Array<String>){

    var obj = Person3()     //object obj of class Person3 is made, which is called from inside package com.shreks
    obj.name = "Zephyr"         //name variable is referenced by the help of obj

    println("The name of the person is " + obj.name)
    //Or use string interpolation as by ${}
    print("The name of the person is ${obj.name}")   //string interpolation is used

}
