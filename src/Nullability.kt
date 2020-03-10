fun main(args: Array<String>) {

    var name: String = "Tommy M"
//    name = null -> not allowed

    // Nullables are similar to Optionals (in swift)
    var nullableName: String? = "Tommy M"
    nullableName = null

    // Null check (Second one is better, as it's inline)
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    // Safe Call Operator
    println(nullableName?.length)

    // Elvis Operator (FUCK YEAH)
    val len = nullableName?.length ?: -1
    println(len)
    val noName = nullableName ?: "No one knows me..."
    println(noName)

    // BangBang (crashes app in case of NULL)
    println(nullableName!!)
}