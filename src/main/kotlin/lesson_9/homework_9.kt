package lesson_9

fun main(){
//    val square = squareDraw()
//    val triangle = triangleDraw()
//    val count = countNumber()
    val newNumbers= firstTwenth()
}

fun squareDraw() {
    var i = 0
    var j = 0
    for (i in 0..3) {
        for (j in 0..4) {
            print(" * ")}
        println(" ")
        }
}

fun triangleDraw() {
    var i = 0
    val j = 5
    for (i in 0..5) {
        for (j in 0 until j - i) {
            print("  ")
        }
        for (j in 0 until i) {
            print(" *")
        }
        println()
    }
}

fun countNumber() {
    var number = 1000
    when (number) {
        in 0..9 -> println("1 цифра")
        in 0..99 -> println("2 цифры")
        in 0..999 -> println("3 цифры")
        in 0..9999 -> println("4 цифры")
        in 0..99999 -> println("5 цифр")
        in 0..999999 -> println("6 цифр")
    }
}

fun firstTwenth() {
    for(n in 2..40 step 2){
        println(n*2)
    }
}
