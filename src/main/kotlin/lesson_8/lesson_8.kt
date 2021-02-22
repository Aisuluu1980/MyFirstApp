package lesson_8

fun main(){
    //Array
//    val myArray = Array(5){0}   //element 00000 index 01234
//    myArray[0] = 42
//    myArray[4] = 322

    val myArray = arrayOf(1, 2, 3, 4, 5)   //еще один вариант создания списка не меняется динамически, как создали размер, такой и будет
    println(myArray[4])

    //Array List
    val myArrayList = ArrayList<String>()  //создала пустой лист, можно менять размер листа, добавлять, удалять
    myArrayList.add("Kotlin")
    myArrayList.add("Python")
    myArrayList.add("Java")
    myArrayList.add(1,"JavaScript")   // после Kotlin добавит JavaScript
    myArrayList.remove("Python")
    println(myArrayList)
    println(myArrayList.size)

    val myNewArrayList = arrayListOf<String>("Aisl", "Nadina", "Sanjar", "Nursultan", "Aidin")   //можно сразу так создать
    println(myNewArrayList)
}