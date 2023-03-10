fun main(args: Array<String>) {
    val car = Car("cadillac","escalade","white","4")
    car.carry(4,4)
    car.identity()
    car.calculatePackingFees(20)

    val bus = Bus("minibus","360","blue","12")
    bus.carry(14,12)
    bus.identity()
    bus.calculatePackingFees(6,12)
}

open class Vehicle(var make:String,var model:String,var color:String,var capacity:String){
    fun carry(people:Int,capacity:Int){
        var x =people-capacity
        if (x==capacity){

            println("carrying $people passengers")
        }else {
            println("Over capacity by $x people")

        }    }
    fun identity(){
        println("i am a $color $make $model")

    }
    }
/*Create a class Car with the following attributes: make, model, color, capacity.
It has these functions:
- carry(people: Int) : Prints out “Carrying $people passengers” if the
number of people is within its capacity else it prints out “Over capacity
by $x people” where x is the number of people exceeding its capacity

- identity() : Prints out the color, make and model in the following
format e.g: “I am a white subaru legacy”
- calculateParkingFees(hours: Int) : Calculates and returns the
parking fees by multiplying the hours by 20*/

class Car (make:String, model:String, color:String,capacity:String,):Vehicle(make,model,color,capacity){

    fun calculatePackingFees(hours:Int):Int{
        var parking = hours*20
        println(parking)
        return parking

    }

    }

/*Create a class Bus with the same attributes and functions as the Car class.
In addition, it has another method called maxTripFare(fare: Double) that
calculates and returns the maximum amount of fare that can be collected per
trip.
The bus’ calculateParkingFees method returns the product of hours and
the capacity of the bus*/

class Bus(make:String,model:String,color:String,capacity:String,):Vehicle(make,model,color,capacity){
    fun maxTripFare(fare: Double,capacity: Int):Double{
        var multi = capacity * fare
        return multi
    }

     fun calculatePackingFees(hours: Int,capacity:Int): Int {
        var packing = hours * capacity
    println(packing)
    return packing
    }
}


