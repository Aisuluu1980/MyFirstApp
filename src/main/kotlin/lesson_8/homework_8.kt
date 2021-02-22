package lesson_8

fun main(){
    val summary = sumLists()
    val max = maxValue()

}
fun sumLists(){
    val arrayFirst = arrayOf(1, 2, 3)
    val arraySecond = arrayOf(4, 5, 6)

    val newArray =arrayFirst.sum() + arraySecond.sum()
    println(newArray)
}

fun maxValue(){
    val arrayNew = listOf(5, -3, 15, 61, 29, 10, -2 ,7)
    val maxElement = arrayNew.maxOrNull()

    println("Max element: $maxElement")
}