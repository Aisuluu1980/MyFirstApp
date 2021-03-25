package lesson_19

fun main(){
    val book1 = Book("Унесенные ветром том1", "Маргарет Митчелл", 1945)
    println(book1.toString())
    val book2 = book1.copy(name = "Унесенные ветром том2", year = 1960)
    println(book2.toString())
    val book3 = Book("Война и мир том1", "Л.Толстой", 1950)
    println(book3.toString())
    val book4 = book3.copy(name = "Война и мир том2")
    println(book4.toString())
    val book5 = book3.copy(name = "Война и мир том3")
    println(book5.toString())
    val book6 = book3.copy(name = "Война и мир том4", year = 1960)
    println(book6.toString())
    val book7 = book3.copy(name = "Война и мир том5", year = 1960)
    println(book7.toString())

}
data class Book(
    val name:String,
    val author:String,
    val year:Int){
}