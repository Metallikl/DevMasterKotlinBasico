package basic

fun hello(){
    println("Hello")
}

fun toUpper(str: String):String{
    return str.toUpperCase()
}

fun firstLetter(str: String): Char{
    return str[0]
}

fun getLetterInPosition(str: String,idx: Int): Char{
    val nIdx = if(idx > str.length)  str.length else idx
    return str[nIdx]
}

fun main(args: Array<String>) {
    hello()
    //
    println(toUpper("ola CoMO vC EsTa"))
    println(firstLetter("Daniel"))
    println(getLetterInPosition("Daniel",5))
}