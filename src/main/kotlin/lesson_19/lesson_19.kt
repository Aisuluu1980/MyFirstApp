package lesson_19

fun main(){
    val person1 = Employee("Asan", "Usenov", 27, 2)
    val person2 = Employee("Asan", "Usenov", 27, 2)
    val person3 = person1.copy(surName = "Aitmatov")
    //для person3 скопировали данные person1, но поменяли фамилию

    println(person1.toString())
//    println("personal1 hash: ${person1.hashCode()}")    //это не нужно если указали data перед class
//    println("personal1 hash: ${person2.hashCode()}")
    println(person1 == person2)
    println(person1 == person3)
    println("person3: $person3")
    }
data class Employee(
        val name:String,
        val surName:String,
        val age:Int,
        val experience:Int){
//если добавили data перед class то это все можно не писать
//    override fun toString():String{
//        return "$name, $surName, $age, $experience"
//    }
//    override fun equals(other:Any?):Boolean{
//        return this.name == (other as Employee).name
//    }
}