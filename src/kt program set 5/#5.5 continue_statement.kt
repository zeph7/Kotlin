//in Java you can continue to inner loop simply but can't continue to outer loop so easily
//but Kotlin includes an easy way to continue to outer loop

fun main(args: Array<String>){
    var i: Int
    var j: Int
    myloop@ for (i in 1..3){        //labelling this for loop as myloop
        for (j in 1..3){
            if(i == 2 && j == 2)
                continue@myloop        //continue to loop which is labelled as myloop
            println("$i $j")
        }
    }
}

//you can anytime continue to any loop labelled by any user defined name like myloop