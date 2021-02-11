var value: String? = null

lateinit var lateValue: String
fun main(){

    value = "Kotlin"
    //safe call operator(?.)
//    println(value?.length)      // чтобы value был null

    //safe call operator with let(?.let)
    value?.let{
//        println(it.length)
    }

    //Elvis operator(?:)
    val length = if(value != null) {
        value!!.length
    }else{
        -1
    }
    val length2 = value?.length ?: -1   //можно записать все одной строки, вместо того, что выше через if
//    println(length2)


    //Non null assertion operator(!!)
    println(value!!.length)

    //'lateinit' keyword
    lateValue = "Java"
    println(lateValue.length)

}