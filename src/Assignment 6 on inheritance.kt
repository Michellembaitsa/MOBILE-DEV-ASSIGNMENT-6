fun main(){
    var car=Car("Subaru","Forester","Black",5)
    car.identity()
    car.carry(7)
    println(car.calculateParkingFees(4))

    var bus=Bus("Scania","300","Blue",50)
    bus.identity()
    bus.carry(40)
    println(bus.maxTripFare(50.0))
    println(bus.calculateParkingFees(2))

}
open class Vehicles(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x= people-capacity
        if ( people <= capacity){
            println("Carrying $people passengers.")
        }else{
            println("Over capacity by $x people.")
        }
    }
    fun  identity(){
        println("I am a $color $make $model.")
    }
    open  fun calculateParkingFees(hours:Int):Int{
        return hours*20
    }
}
class Car(make:String,model:String, color:String, capacity:Int): Vehicles(make,model,color,capacity){
}

class Bus(make:String,model:String,color:String,capacity:Int): Vehicles(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var max= fare*capacity
        return max
    }
    override fun calculateParkingFees(hours: Int):Int{
        return hours * capacity
    }
}