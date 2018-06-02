package basic

fun main(args: Array<String>) {
    var idx = 1
    val interval = 0..20
    val interval2 = 100..0
//    for(x in 1..10){
//        println(x)
//    }
    for(x in interval step 2){
        println(x)
    }
    //
    for(x in 100 downTo 1 step 2 ){
        println(x)
    }

    //
//    while (idx < 10){
//        println(idx)
//        idx++
//    }
    //
//    do{
//        println(idx)
//        idx++
//    }while (idx < 10)
}