package lesson_19

fun main(){
    val cat = Cat("Barsik", "black")
    println(cat.toString())
    println("cat hash: ${cat.hashCode()}")
    println("-----------------------------------")

    val paper = Paper("black", "A4", 150)
    println(paper.toString())
    println("paper hash: ${paper.hashCode()}")
    println("-----------------------------------")

    val myFood = Food("Burger")
    println(myFood.toString())
    println("myFood hash: ${myFood.hashCode()}")
    println("-----------------------------------")

    val boiler = waterBoiler(180, "LG")
    println(boiler.toString())
    println("boiler hash: ${boiler.hashCode()}")
    println("-----------------------------------")

    val battery = Battery("siemens", "big", 600)
    println(battery.toString())
    println("battery hash: ${battery.hashCode()}")
    println("-----------------------------------")

    val liquid = Liquid("Pink")
    println(liquid.toString())
    println("liquid hash: ${liquid.hashCode()}")
    println("-----------------------------------")

    val cup = Cup("Tea", "small")
    println(cup.toString())
    println("cup hash: ${cup.hashCode()}")
    println("-----------------------------------")

    val box = Box("My blue box")
    println(box.toString())
    println("box hash: ${box.hashCode()}")
    println("-----------------------------------")

    val student = Student("Aisl", "Dzhusupova", "Kotlin")
    println(student.toString())
    println("student hash: ${student.hashCode()}")
    println("-----------------------------------")

    val worker = Worker("Nadina", "Sanjarbek", 25, "BaitushumBank")
    println(worker.toString())
    println("worker hash: ${worker.hashCode()}")
    println("-----------------------------------")
}

data class Cat(
    val name:String,
    val color:String) {}

data class Paper(
    val color: String,
    val size:String,
    var price: Int){}

data class Food(
    val name:String){}

data class waterBoiler(
    val capacity:Int,
    val model:String){}

data class Battery(
    val name: String,
    val size:String,
    var quantity: Int){}
data class Liquid(
    val color: String){}

data class Cup(
    val sort:String,
    val size:String){}

data class Box(
    val name: String){}

data class Student(
    val name:String,
    val surname:String,
    val group:String){}

data class Worker(
    val name: String,
    val surname:String,
    val age:Int,
    var company:String){}