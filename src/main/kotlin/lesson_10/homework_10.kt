package lesson_10

fun main(){
    val itemCosts = mapOf<String, Double>("Хлеб" to 50.0, "Макароны" to 35.0)
    val shoppingList = listOf("Хлеб", "Макароны", "Рис")

    var total = 0.0
    for (product in shoppingList){
        val cost = itemCosts[product]
        if(cost != null){
            total += cost
          }
    }
    println("Стоимость покупки: $total")
}