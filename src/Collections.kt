fun main(args: Array<String>) {

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials.contains("Butt"))
    println(imperials)

    val rebels = arrayListOf("Leah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewy")
    rebels.add(2,"Landon")
    println(rebels.indexOf("Luke"))
    println(rebels.remove("Mon Mothma"))
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap)
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leah", "This ship doesn't exist"))


    val rebelVehiclesHashMap = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    rebelVehiclesHashMap["Luke"] = "X - Wing"
    rebelVehiclesHashMap.put("Leah", "Han")
    rebelVehiclesHashMap.remove("Solo")
    println(rebelVehiclesHashMap.getOrDefault("Leah", "This ship doesn't exist"))
    println(rebelVehiclesHashMap.isEmpty())
    println(rebelVehiclesHashMap)
}