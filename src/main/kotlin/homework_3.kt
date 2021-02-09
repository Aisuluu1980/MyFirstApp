fun main(args: Array<String>) {

    val firstFun = summary()
    val secondFun = subtraction()
}

fun summary(){
    print("Введите 1е число ")
    val number1: Int = readLine()!!.toInt()
    print("Введите 2е число ")
    val number2: Int = readLine()!!.toInt()
    println("Ответ a + b = ${number1 + number2}")
}

fun subtraction(){
    print("Введите 1е число ")
    val number1: Int = readLine()!!.toInt()
    print("Введите 2е число ")
    val number2: Int = readLine()!!.toInt()
    println("Ответ a - b = ${number1 - number2}")
}