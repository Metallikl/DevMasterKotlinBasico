package basic

fun main(args: Array<String>) {
    val number: Int = 10
    val longNumber: Long = 100
    //
    var n1: Int
    n1 = longNumber.toInt()
    println(longNumber.toString())
    //
    val strNumber: String = "10"
    n1 = strNumber.toInt()
    //
    println("Meu numero é : $n1")

}