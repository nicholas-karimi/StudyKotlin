fun main(){
    println("What is your name ?")
    val name = readLine()

    println("Thank you ${name?.capitalize()}. Would you like to see your name reversed?")
    val response = readLine()

    if (response != null){
        if (response.lowercase() == "yes"){
            val reversed = name?.uppercase()?.reversed()
            println("your reversed name is $reversed")
        }
        else if(response == "no"){
            println("No worries! ${name?.capitalize()}")
        }
        else {
            println("Hello $name")
        }
    }

}