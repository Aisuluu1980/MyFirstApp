import kotlin.math.*

fun main(args: Array<String>){
    val quadratic = quadraticFun()

    val time = timeFun(9, 25, 13, 1)
    println("Дополнительное задание №1")
    println("Время поезда в пути: $time минут")

    val changeNumber = changeFun()
    println("Дополнительное задание №2")
}

fun quadraticFun() {
    println("ax2 + bx + c = 0")

    println("Введите a, b и c ")
    val a: Double= readLine()!!.toDouble()
    val b: Double = readLine()!!.toDouble()
    val c: Double= readLine()!!.toDouble()

    val discriminant = b*b - 4 * a * c
    println("Дискриминант равен: $discriminant")
    val x1 = (-b - sqrt(discriminant)) / (2 * a)
    val x2 = (-b + sqrt(discriminant)) / (2 * a)
    if (discriminant < 0){
        println("Дискриминант отрицательный, корней нет.")
    } else if(discriminant > 0){
        println("Корни уравнения: x1 = $x1, x2 = $x2")
    }else{
        println("Корень уравнения один: x = ${-b / (2 * a)}")
    }
}

fun timeFun(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int = (
        (hoursArrive - hoursDepart)*60 + (minutesArrive - minutesDepart))

fun changeFun(){
    println("Введите два числа: ")
    var first: Int= readLine()!!.toInt()
    var second: Int = readLine()!!.toInt()
    first = first + second
    second = first - second
    first = first - second
    println("Первое число = $first, Второе число = $second")
}