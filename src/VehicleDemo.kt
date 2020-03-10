open class VehicleDemo(val make: String, val model: String) {

    open fun accelerate() {
        println("Accelerating")
    }

    fun park() {
        println("Parking")
    }

    fun brake() {
        println("Braking")
    }
}