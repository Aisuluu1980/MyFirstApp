package lesson_5

fun main(args: Array<String>) {
    val happy = happyNum()
    val age = myAge()
}

fun happyNum(){
    println("Введите четырехзначное число.")
    val string = readLine()!!
    val numbers = string.map(Character::getNumericValue).toIntArray()
    val sumOne = numbers[0] + numbers[1]
    val sumTwo = numbers[2] + numbers[3]
    if(sumOne == sumTwo){
        println(true)
    } else{
        println(false)
    }
}

fun myAge() {
    println("Введите свой возраст!")
    val age = readLine()!!.toInt()
    if (age > 1  && age < 200) {
        if (age % 10 == 0) {
            println("$age лет")
        } else if (age % 10 == 1) {
            println("$age год")
        } else if (age  % 10 >= 5) {
            println("$age лет")
        } else {
            println("$age года")
        }
    }
    else{
        println("Введите правильное значение.")
    }
}