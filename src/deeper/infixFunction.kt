package deeper

fun Int.isHalfOf(value: Int) = value / 2 == this

/**
 * FUNÇÕES INFIX
 * INFIX significa que a função pode ser chamada sem a utilização de
 *  'ponto' para ser acessada e é sempre usada no MEIO de duas variaveis.
 * OBS: funções INFIX, só podem conter um parametro, pois a sintax não
 * permite mais campos...
 */
infix fun Int.isDoubleOf(value: Int) = value * 2 == this

/**
 * Funções infix tb funcionam dentro de classe.
 */
class Person(val name: String){
    infix fun isName(value: String):Boolean{
        return value == name
    }

}

fun main(args: Array<String>) {
    //Como a função atribuida a Int não é infix, somente conseguimos acessar,
    // como um metodo.
    10.isHalfOf(20)//Aqui funciona, como metodo
    //5 isHalfOf 10//Aqui, declarado como "texto" não funciona

    //Agora aqui, como  isDoubleOf é infix, ou seja," É FIXADA NO MEIO (IN FIX)",
    //podemos usar como "texto"
    40.isDoubleOf(20)//chamada como metodo
    40 isDoubleOf 20//chamada como texto.

    //INFIX COMO FUN DE CLASSE
    val p1 = Person("Daniel")
    //fun infix\/
    p1 isName "Daniel"




}