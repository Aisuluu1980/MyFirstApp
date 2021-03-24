package lesson_18

fun main(){
    val person = Person("Aisl", "Djusupova", 40)
    println(person.name)
    println(person.surName)
    println(person.age)
//    println(person.address)
    person.introduceYourSelf()
    val employee = Employee("Elon", "Mask", 40, 20)
    println(employee.introduceYourSelf())
}

/// если хотим создавать Person  с кастомными значениями
//class Person(name:String, surname:String, age:Int){
//    var name: String = "John"
//    var surName:String = "Doe"
//    var age : Int = 27

//    init {
//        this.name = name
//        this.surName = surname
//        this.age = age
//    }
//}
//конструктор запись, не полноценная запись для обьекта
//class Person(val name: String, val surName:String, val age: Int){
//    var address: String? = null
//    в конструкторе добавили новое поле
//    constructor(name: String, surName: String, age: Int, address:String): this(name, surName, age){
//        this.address = address
//    }
//}
//open чтобы можно было наследовать с класса Person
open class Person(val name: String, val surName:String, val age: Int){
    open fun introduceYourSelf(){
        println("My name is $name, i love programming")
    }
}
//Наследование
class Employee(name:String, surName:String, age:Int, val experience:Int): Person(name, surName, age){
    override fun introduceYourSelf() {
//        super.introduceYourSelf()   //унаследует тоже самое что и предыдущая функция
    println("my name is $name $surName, I have $experience years of experience!")   //свою функцию создали
    }

}