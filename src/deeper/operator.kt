package deeper

import kotlin.test.currentStackTrace

data class Fraction(var numerator: Int, val denominatior: Int){

    operator fun plus(add: Fraction):Fraction{
        if(denominatior == add.denominatior){
            return Fraction(numerator + add.numerator,denominatior)
        }else{
            val comum = denominatior * add.denominatior
            //
            return Fraction(((comum / denominatior) * numerator)+((comum / add.denominatior) *add.numerator), comum)
        }
    }

    operator fun inc(): Fraction{
        this.numerator *= 2
        return this
    }
}


fun main(args: Array<String>) {
    var n1: Int = 10
    //As duas linhas abaixo são a mesma coisa
    n1.plus(10)//
    n1 = n1 + 10//
    //As duas linhas abaixo são a mesma coisa
    n1.times(10)
    n1 = n1 * 10
    //
    var f1 = Fraction(3,2)
    val f2 = Fraction(5,3)
    //
    println(f1 + f2)
    f1++
    println(f1)


}