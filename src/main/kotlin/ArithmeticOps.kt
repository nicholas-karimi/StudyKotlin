fun main(){

//    Integers
    var message1: String = "integres"
    val x = 5
    val y = 13

    val result = x + y

    println("Begin ops for ${message1.toUpperCase()}")
    println("The result of x + y is : ${x + y }")

//    Assignment
    val a = 3
    val b = 4
    val c = 7

    println("The value of a is: $a")
    println("The sum of a + b is: ${a + b}")
    println("The sum of a + b + c is: ${a + b + c}")
    println()
    var message2: String = "decimals"
    println("Begin ops for ${message2.uppercase()}")

    val n: Float = 20F
    val k = 8F
    println("The result of n / k is: ${n / k}")

/*
assignment - calculate vol of a sphere
Formula - vol =  0.75 * pi * radius^3
* */
    val pi = 3.14159265
    val radius = 5.5
    val volume = 0.75 * pi * radius * radius * radius
    println("The volume of a sphere with the radius $radius is: $volume")


}