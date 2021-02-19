package lesson_6

//fun main() {
//    val score = -5
//    when {
//        score >= 90 && score <= 100 -> println("5")
//        score >= 70 && score < 90 -> println("4")
//        score >= 50 && score < 70 -> println("3")
//        score >= 30 && score < 50 -> println("2")
//        score >= 0 && score < 30 -> println("1")
//        else -> println("Invalid score")
//    }
//}
// легче так написать, все тоже самое что и наверху
//fun main() {
//    val score = -5
//    when (score){
//        in 90..100 -> println("5")
//        in 70..89 -> println("4")
//        in 50..69 -> println("3")
//        in 30..49 -> println("2")
//        in 0..29 -> println("1")
//        else -> println("Invalid score")
//    }
//
//val a = 5
//val b = 3
//
//val maxValue = when(a>b) {
//    true -> a
//    false -> b
//}
//    println("maxvalue: $maxValue")
//}

fun main() {
    val score = 60
    when (score) {
        in 90..100 -> println("5")
        in 70..89 -> println("4")
        in 50..69 -> println("3")
        in 30..49 -> println("2")
        in 0..29 -> println("1")
        else -> {println("Invalid score")
    }
}
     when{
        3<2 -> println("3>2")
        "string".length == 6 -> println("length is 6")   //вызовет первый попавшийся true
        2>3 -> println("2>3")
        else -> {
            println("else called")
    }
}
    val a = 5
    val b = 3

    val maxValue = when(a>b) {
        true -> a
        false -> b
    }
    println("maxvalue: $maxValue")
}
