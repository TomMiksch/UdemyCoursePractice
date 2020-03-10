fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message)}

    printMessage("Hello world!")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(3, 5))

    val sumB: (Int, Int) -> Int = {x, y -> x + y}
    println(sumB(6, 9))

//    Very useful for web calls
    fun downloadData(url: String, completion: () -> Unit) {
        // Sent a download request
        // get data back
        // No errors
        completion()
    }

//    call downloadData function
    downloadData("fakeUrl.com") {
        println("The code in this block only runs after completion()")
    }

    fun downloadCarData(url: String, completion: (CarDemo) -> Unit) {
        // Sent a download request
        // get car data back
        val car = CarDemo("Chevy", "Equinox", "Black")
        completion(car)
    }

    // The following work the same
    downloadCarData("realUrl.com") {car ->
        println(car.color)
        println(car.make)
        println(car.model)
    }

    downloadCarData("realUrl.com") {
        println(it.color)
        println(it.make)
        println(it.model)
    }

    fun downloadTruckData(url: String, completion: (TruckDemo?, Boolean) -> Unit) {
        val webRequestSuccess = false
        if (webRequestSuccess) {
            val truck = TruckDemo("Ford", "F-150", 6)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fake.net") {truckDemo, success ->
        if (success) {
            truckDemo?.tow()
        } else {
            println("Something went wrong!")
        }
    }
}