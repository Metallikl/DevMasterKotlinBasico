package basic

fun hello2() = println("Hello")

fun toUpper2(str: String) = str.toUpperCase()

fun firstLetter2(str: String) = str[0]

fun whichNumerIsBigger(n1: Int, n2:Int) = if(n1 > n2) n1 else n2

fun main(args: Array<String>) {
     hello2()
    //
    println(toUpper2("roNalD"))
    println(firstLetter2("roNalD"))
    println(whichNumerIsBigger(3,5))
}
