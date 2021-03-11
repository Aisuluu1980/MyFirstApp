package lesson_17

//fun main(){
//    sayHelloKotlin("Kotlin")
//    sayHelloKotlin("Java")
//}

//fun sayHelloKotlin(name: String){
//    println("Hello $name! Where are you?")
//}

fun main() {
//    sayHelloKotlin("Kotlin",3)
    println(getMax(5,6))
    println(getMax(7.0, 9.0))
    println(getMax(3,4,5))
    sayHello("Kotlin")
    printInts(1,2,3,4)
}
fun printInts(vararg ints: Int){
    for(i in  ints) println(i)
}

//fun getMax(num1:Int, num2: Int): Int{
//    return if(num1 > num2) num1 else num2

//}

//лучше такая запись без body функции если return нет
fun getMax(num1:Int, num2: Int) = if(num1 > num2) num1 else num2

//сработает и эта функция потому что тип Double
fun getMax(num1:Double, num2: Double): Double{
    return if(num1 > num2) num1 else num2
}

//добавим еще один аргумент и условие while
fun getMax(num1:Int, num2: Int, num3: Int): Int{
    return when {
        num1 > num2 && num1 > num3 -> num1
        num2 > num2 && num2 > num3 -> num2
        else -> num3
    }
}


//fun sayHelloKotlin(name: String, reps: Int){
//    var counter = reps
//    while(counter > 0) {
//        println("Hello $name! Where are you?")
//        counter--
//    }

//}
//значение по умолчанию 1, выведет только один раз и не принимать аргумент
fun sayHello(name: String, reps: Int = 1) {
    var counter = reps
    while (counter > 0) {
        println("Hello $name! Where are you?")
        counter--
    }
}