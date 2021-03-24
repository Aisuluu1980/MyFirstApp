package lesson_18

fun main(){
    val cat = Cat("Graff", 5, "hungry", 3)
    cat.aboutCat()
    val newlevel = Change("Graff", 5, "hungry",3, "well-fed", 10)
    println(newlevel.aboutCat())

}

open class Cat(val name: String, val age:Int, val satiety:String, val water: Int){
    open fun aboutCat(){
        val satiety = satiety
        val water = water
        println("My cat`s name is $name, age- $age, satiety level - $satiety and water level- $water.")
    }
}
class Change(name:String, age:Int, satiety:String, water:Int, val newSatiety:String, val newWater:Int): Cat(name, age, satiety, water){
    override fun aboutCat() {
        println("Change satiety level- $newSatiety, and water level - $newWater for cat-$name.")
    }
}


