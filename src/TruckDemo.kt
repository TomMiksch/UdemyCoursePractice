class TruckDemo(make: String, model: String, val towingCapacity: Int): VehicleDemo(make, model) {
    fun tow() {
        println("I got the horses in the back")
    }

    fun details() {
        println("The $make $model has a towing capacity of $towingCapacity pounds")
    }
}