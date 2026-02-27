package oop_111394_KevinAlif.week4

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEV = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myEV.openTrunk()
    myEV.honk()
    myEV.accelerate()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Pak Anton", baseSalary = 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "Clavis", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}