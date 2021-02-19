package lesson_6
import kotlin.math.sqrt
fun main(){
    val mon = monthDays(9)
    val dot = dotCircle(10.0, -3.0, 5.0 )

}

fun monthDays (monthNumber: Int){
    when (monthNumber){
        2 -> println("Месяц $monthNumber - дней 28")
        4, 6, 9, 11 -> println("Месяц $monthNumber - дней 30")
        else -> println("Месяц $monthNumber - дней 31")
    }
}

fun dotCircle(x: Double, y: Double, radius: Double){
    val hypotenuse = sqrt(x*x) + sqrt(y*y)
    when {
        hypotenuse > radius -> println("Точка не принадлежит кругу.")
        hypotenuse <= radius -> println("Точка принадлежит кругу.")
    }
}