package lesson_5

//fun main(){
//    val a = 5
//    val b = 3
// &&- и
//    if( a == b && a > b){
//        println("a больше b.")
//    }
//    if( a > b || a < b){               //или
//        println("a больше b.")
//    }
//}

fun main(){
    val score = -5
    if ( score >= 90 && score <= 100){
        println("5")
    }else if(score >= 70 && score < 90){
        println("4")
    }else if(score >= 50 && score < 70){
        println("3")
    }else if(score >= 30 && score < 50) {
        println("2")
    }else if(score >= 0 && score < 30) {
        println("1")
    }else{
        println("Invalid score")
    }

    val a = 1000
    val b = 500
    val maxValue = if(a > b){
        println("a bigger b")
        a
    }else{
        b
    }
}