

fun main(){
    val x = 6
    val y = 8

//    assign value to z pragmatically
    val z = if (x + y == 14) 5 else 7

    if(x < y || y * y== 64){
        println("One condition evals to true")
    }
    else if( x > y){
        println("X is greater than y")
    }
    else{
        println("Y is gretaer than X")
    }
    println("Value for z is $z")
}
