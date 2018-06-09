package deeper

fun operator(x: Int, y: Int,op: (Int, Int) -> Int): Int{
    val ret = op(x,y)
    return ret
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

//Fun que só funciona para lista de inteiro
//fun List<Int>.paraCada(op: (Int) -> Unit){
//    for(i in this){
//        op(i)
//    }
//}

//Fun para qualquer lista generica
// Porem não funciona com o map, que não extend de list, mas sim de iterable
//fun <T>List<T>.paraCada(op: (T) -> Unit){
//    for(i in this){
//        op(i)
//    }
//}

//Fun para qualquer classe que extend de Iterable. EX: List, Map etc
fun <T>Iterable<T>.paraCada(op: (T) -> Unit){
    for(i in this){
        op(i)
    }
}

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)
    //
    list.forEach { println(it) }
    list.paraCada { println(it) }
    //a sintax ::  significa que stamos passado um função
    operator(1,2, ::sum)
    operator(1,2, ::multiply)
    //
    val listS = listOf("a","b")
    listS.paraCada { println(it) }

    val map = mapOf(Pair("Paris","Roma"))
    map.values.paraCada{ println(it)}
}