fun main(args: Array<String>) {
    val str = "May the fourth be with you."
    println(str)

    val str1 = "my dad said the funniest thing, he said \"{Insert Joke Here}\""
    println(str1)

    val rawCrawl = """A long time ago,
        >in a galaxy
        >far, far away...
        >DUN DUN DUN..."""
    println(rawCrawl.trimMargin(">")) // Default character is |

    for (char in str) {
        println("${char}")
    }

    val contentEquals = str.contentEquals("May the fourth be with you.")
    println(contentEquals)

    val contains = str.contains("Fourth", true)
    println(contains)

    val upper = str.toUpperCase()
    val lower = str.toLowerCase()
    println(upper)
    println(lower)

    val num = 5
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 7)
    println(subsequence)

    val correctWayToDoVariablesInStrings = "Luke Skywalker" // Can use $variable or ${variable}
    val saberColor = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$correctWayToDoVariablesInStrings has a $saberColor lightsaber and drives a $vehicle" +
            " and is $age years old")
    println("Luke's full name is $correctWayToDoVariablesInStrings and has ${correctWayToDoVariablesInStrings.length}" +
            " letters in it")
}