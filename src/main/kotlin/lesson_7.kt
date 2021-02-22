fun main(){
    val main1 = main1()
    val main2 = main2()

}

fun main1(){
    val a = 17

    val message =
        if (a % 2 == 0){
            println("a is even.")
        }else if (a % 5 == 0){
            println("a is divisible by 5")
        }else{
            println("a is not even and not divisible by 5.")
        }
}

fun isFive(x: Int) = x % 5 == 0
fun isEven(x: Int) = x % 2 == 0

fun main2(){
    var number = 25
    when{
        isEven(number) -> println("number is even.")
        isFive(number) -> println("number is divisible by 5.")
        else -> println("number is not even and not divisible by 5.")
    }
}