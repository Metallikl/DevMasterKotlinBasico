package basic

import java.util.*

//fun whatHappened(year: Int): String{
//    if(year == 2018){
//        return "Ano do curso"
//    }else if(year > 2018 && year <= 2020){
//        return "Tentando ir pro Canada"
//    }else{
//        return "Sei la"
//    }
//}

//fun whatHappened(year: Int): String =
//        when (year) {
//            2018 -> "Ano do curso"
//            2019, 2020 -> "Tentando ir pro Canada"
//            else -> "Sei lá"
//        }

//When sem analise da variavel entre ()
fun whatHappened(year: Int): String =
        when {
            year == 2018 -> "Ano do curso"
            year in 2019..2020 -> "Tentando ir pro Canada"
            else -> "Sei lá"
        }

fun main(args: Array<String>) {
    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    //
    println(whatHappened(year))

}