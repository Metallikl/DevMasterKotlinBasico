package basic

fun main(args: Array<String>) {
    try {
        var number = "kja".toInt();
    } catch (e: NullPointerException){
        println("Null pointer")
    } catch (e: NumberFormatException){
        println("Não é um numero")
    } catch (e: Exception){
        println("Não sei o que aconteceu")
    } finally {
        println("Finalmente")
    }
    //
}