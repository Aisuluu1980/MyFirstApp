fun main(){
    var a = 10
    val b = 3

    println("-a = ${-a}")   // отрицательное значение

    //инкремент увеличение переменной на 1 единицу
    println("a++ = ${a++}")  // сначала возвращает a и прибавляет, изначально а=10, вернет 10 и потом уже а ==11 но на печатьь выйдет 10
    println("++a = ${++a}")  // итог 12   сначала прибавит 1 потом делает возврат
//    декремент уменьшение переменной на 1 единицу
    println("a-- = ${a--}")  // значение == 11 а при печати 12
    println("--a = ${--a}")  // значение сначала 11  вывод ==10

    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")
    println("a%b = ${a%b}")

    println("2+2*5 = ${(2+2)*5}")

//    a = a+2
    a += 2   //такая же запись как и выше
    println("a += 2 : $a")
    a -= 2
    println("a -= 2 : $a")
    a *= 2
    println("a *= 2 : $a")
    a /= 2
    println("a /= 2 : $a")
    a %= 2
    println("a %= 2 : $a")





}