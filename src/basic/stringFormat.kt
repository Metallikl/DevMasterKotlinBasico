package basic

fun main(args: Array<String>) {
    val name = "Daniel" +
                "Betteloni "+
                "Dalle "+
                "Luche"
    val name2 = """Daniel
        Betteloni
        Dalle
        |Luche
    """.trimMargin()
    //
    println(name2)
    //
    val name3 = "Daniel"
    println("Olá, ${name3.length}")
    println("Olá, ${name3[0]}")
}