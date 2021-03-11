package lesson_17

import java.lang.String


fun main(){
    val percents = depositAccount(100, 10)
    println(String.format("Total from 3 years: %.2f", percents))
}

fun depositAccount(initial: Int, percent: Int): Double = (
        initial * Math.pow((1 + percent / 100.0), 3.0))
