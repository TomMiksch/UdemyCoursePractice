fun main(args: Array<String>) {
    val a = 2
    val b = 3
    if (a == b) {
        println("a is equal to b")
    }
    if (a != b) {
        println("a does not equal b")
    }

    val accountBalance = -100
    val price = 50
    if (accountBalance >= price) {
        println("You can afford this!")
    } else {
        println("Sorry homie, you're broke")
    }

    val degrees = 49
    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Fuck it's cold")
    }

    val isHungry = false
    val isBored = true
    if (isHungry || isBored) {
        println("We should eat")
    }

    // When statements are switch statements
    val x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x != (1 || 2)")
    }

    fun vaderIsFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("Run for the hills, Vader is $mood")
        } else {
            println("Whatever you do, don't make Vader angry, he's $mood")
        }
    }
    vaderIsFeeling("special")
    vaderIsFeeling()
}