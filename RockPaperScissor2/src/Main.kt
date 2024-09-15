var randomNumber = 0
var userInput = 0
var inputIncorrect = false


fun main() {
    println("Please choose. Input NUMBER only.")
    println("1. Rock")
    println("2. Paper")
    println("3. Scissor")
    userInput = readln().toInt()

    randomNumber = (1..3).random()


    if (userInput <= -1 || userInput == 0 || userInput > 3) {
        inputIncorrect = true
    }

    while (inputIncorrect) {
        println("INVALID NUMBER")
        println("Please choose again.")
        userInput = readln().toInt()
        if (userInput <= -1 || userInput == 0 || userInput > 3) {
            inputIncorrect = true
        } else {
            inputIncorrect = false
        }
    }

    println("Hello World")

    if (userInput == randomNumber) {
        println("That's a DRAW!")
    }
    if (userInput == 1 && randomNumber == 2) {
        println("You LOSE!")
    }
    if (userInput == 1 && randomNumber == 3) {
        println("You WIN!")
    }
    if (userInput == 2 && randomNumber == 1) {
        println("You WIN!")
    }
    if (userInput == 2 && randomNumber == 3) {
        println("You LOSE!")
    }
    if (userInput == 3 && randomNumber == 1) {
        println("You LOSE!")
    }
    if (userInput == 3 && randomNumber == 2) {
        println("You WIN!")
    }

    if (userInput == 1) {
        println("You choose ROCK")
    }
    if (userInput == 2) {
        println("You choose PAPER")
    }
    if (userInput == 3) {
        println("You choose SCISSOR")
    }

    if (randomNumber == 1) {
        println("Computer choose ROCK")
    }
    if (randomNumber == 2) {
        println("Computer choose PAPER")
    }
    if (randomNumber == 3) {
        println("Computer choose SCISSOR")
    }

    println("Thank you for playing. :)")
}