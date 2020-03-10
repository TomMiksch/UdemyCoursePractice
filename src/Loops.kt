fun main(args: Array<String>) {
    val rebels = arrayListOf("Leah", "Luke", "Han Solo", "Mon Mothma")
    val rebelVehiclesHashMap = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")

    for (rebel in rebels) {
        println("Name $rebel")
    }

    for ((key, value) in rebelVehiclesHashMap) {
        println("$key, $value")
    }

    var x = 10

    while(x > 0) {
        println(x)
        x--
    }
}

