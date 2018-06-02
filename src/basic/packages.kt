package basic

import java.util.*

fun myPackage(){
    println("Olá")
}

fun myPackage2(){
    println("Olá")
}

fun main(args: Array<String>) {
    val calendar: Calendar = Calendar.getInstance()
    //
    println("Estamos no ano de ${calendar.get(Calendar.YEAR)}")
}