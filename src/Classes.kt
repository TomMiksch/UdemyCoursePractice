fun main(args: Array<String>) {
    val car = CarDemo("Chevy", "Equinox", "black")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()
    car.park()

    val truck = TruckDemo("Dodge", "Ram", 10000)
    truck.tow()
    truck.details()
    truck.accelerate()
    truck.brake()
}