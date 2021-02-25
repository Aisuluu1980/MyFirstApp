package lesson_10

fun main(){
    val list = arrayListOf("123450", "aisl1980", "Aisl")
    //key value
    val myMap = hashMapOf<String, String>()         //порядка нет, по разному выходят, а если нужно сохранить порядок HashMap
    myMap.put("password", "123450")
    myMap.put("username", "aisl1980")
    myMap.put("name", "Aisl")
    myMap.put("name", "Nadina")        // значения могут меняться, а ключи уникальные
    myMap.remove("name")          //удаляет ключ
    println(myMap.get("password"))      //достает значение ключа password
    println(myMap.entries)    //вывод всех ключей и значений

    //Set
    val mySet = HashSet<Int>()
    mySet.add(1)              //сохранит тольку одну цифру один, остальное будет игнорить, потому что сохраняет только уникальные значения
    mySet.add(1)
    mySet.add(1)
    mySet.add(1)
    mySet.add(2)
    mySet.add(4)
    mySet.add(3)
//    println(mySet)

    val listNew = arrayListOf(1,2,3,4,4,4,4,1,2, 5, 6)
    mySet.addAll(listNew)   //добавит в сет только уникальные значения списка, все остальное проигнорит
    println(mySet)





}