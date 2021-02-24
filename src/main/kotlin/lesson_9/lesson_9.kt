package lesson_9

fun main(){
    //For loop
    val names = arrayListOf<String>("Java", "Python", "Kotlin")
//    for(i in 0 until names.size){ //но не самый лучший вариант, но может достать элемент по индексу
//        println(names[i])}
//    names.forEachIndexed{index, name ->
//        println("$index, $name")}

//    for(name in names) {
//            println(name)         // без индекса используем
//    }
//    names.forEach{println(it)}   //без индекса

//    for(i in 0..10){
//        println(i)}
//    for(i in  10 downTo 0 step 2){   //обратный отсчет
//        println(i)}
    for(i in 0..10){
        if (i== 6) continue
        println(i)}  // 6 пропадает, но продолжает работать до 10 включительно
    for(i in 0..10){
        if (i== 6) break
        println(i)}  // все что после 6 игнорируется, и завершается цикл
println("--------------------------------------------")
    // while   если условие false  то условие вообще не вызовется
    var j = 11
    while (j <= 10){
        println(j)
        j++
    }

    //do while   если условие false то условие вызовется
    var k = 11
    do{
        println("do while $k")
        k++
    } while(k<= 10)
}
