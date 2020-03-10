fun main(args: Array<String>) {
    val rolen = Elf("Rolen", 35, "Male", 5)
    rolen.bragAboutEars()
    rolen.attack()
    rolen.walk()

    val wario = Warlock("Warlord", 666, "Female", 17)
    wario.defend()
    wario.bragAboutAxes()
}

open class Player(var name: String, var age: Int, var gender: String) {
    fun attack() {
        println("$name has attacked!")
    }

    fun defend() {
        println("The $age year old has defended")
    }

    fun walk() {
        println("The $gender walked in a non-sexist way")
    }
}

class Elf(name: String, age: Int, gender: String, var earLength: Int): Player(name, age, gender) {
    fun bragAboutEars() {
        println("My ears are $earLength feet long")
    }
}

class Warlock(name: String, age: Int, gender: String, var axes: Int): Player(name, age, gender) {
    fun bragAboutAxes() {
        println("I have $axes axes")
    }
}

