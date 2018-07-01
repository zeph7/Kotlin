//in Java you can break out of inner loop simply but can't break out of outer loop so easily
//but Kotlin includes an easy way to break out of outer loop

fun main(args: Array<String>){
    var i: Int
    var j: Int
    myloop@ for (i in 1..3){        //labelling this for loop as myloop
        for (j in 1..3){
            println("$i $j")
            if(i == 2 && j == 2)
                break@myloop        //break's out of loop which is labelled as myloop
        }
    }
}

//you can anytime break out of any loop labelled by any user defined name like myloop