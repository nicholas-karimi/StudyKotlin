/*
A Kotlin Palindrome checker to test understanding
for IF Condition.
What is a Palindrome?
- A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
...There are also numeric palindromes, including date/time stamps using short digits 11/11/11 11:11 and long digits 02/02/2020.
* */

fun main(){
    println("WELCOME TO PALINDROME CHECKER!!")
    val userInput = readLine()

    // check for null exception
    if(userInput != null){
        // check if what user inputs when reversed == same.
        if (userInput == userInput?.lowercase()?.reversed()){
            println("Awesome. The string $userInput is a Palindrome")
        }
        else if (userInput.lowercase() != userInput.lowercase()?.reversed()){
            println("The string $userInput is not a Palindrome!")
        }
    }
}