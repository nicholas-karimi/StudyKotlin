import com.sun.source.tree.AssignmentTree

fun main(){
    val x = 3
    val y = 9
//    println(x == y) -> check equality
//    println(x <= y)
//    println(x != y)

//    logical ops
    val a = 7
    val b = 9
//    print(x == y && a == b) AND operator -> returns false when both conditions not equal
//    println(x == y || a == b) OR -> returns true when one at least condition is true
//    println(!(x == y) || a == b) NOT operator -> Negates true - false, false - true
//    println((!(x == y) || a == b && a > b))

//    Assignment
    val bool = true
    val z = 3
    val hardExpression = !( x != z ) && bool || z > (x+y) && (!bool || y < z)
    println(hardExpression)
}
