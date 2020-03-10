fun main(args: Array<String>) {

    fun forceChoke() {
        println("You have failed me for the last time, Admiral")
    }
    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }
    makeAnEntrance("I find your lack of faith disturbing")

    fun calculateNumberOfGoodGuys(rebels: Int, ewoks: Int): Int {
        return rebels + ewoks
    }
    val rebels = calculateNumberOfGoodGuys(6, 9)
    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberOfGoodGuys(4,20)} rebel scum")

    fun vaderIsFeeling(mood: String = "Angry") {
        println(mood)
    }
    vaderIsFeeling()
    vaderIsFeeling("meh")
}