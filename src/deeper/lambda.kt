package deeper

fun operator2(x: Int, y: Int,op: (Int, Int) -> Int): Int{
    val ret = op(x,y)
    return ret
}

fun sum2(x: Int, y: Int) = x + y

fun multiply2(x: Int, y: Int) = x * y


fun main(args: Array<String>) {
    /**
     * LAMBDAS
     *  Servem para declaramos um expressão de função simples
     *  EX: {u,i -> u + i}
     *  Podemos usar um When, if else, mas não é possivel escrever uma
     *  função mais complexa.
     *  Para esses casos de função complexa, devemos usar as funções anonimas
     */

    operator2(1,2, ::sum2)
    operator2(1,2, ::multiply2)

    //Linha abaixo, lambda declarando um função como valor da variavel.
    val l1 = {a: Int, b: Int -> a + b}
    //Inferimos que o tipo da val l2 é uma função
    //que recebe 2 param Int e que retorna um Int.
    //Na sequencia atribuimos um Lamda de como será executada a função
    val l2: (Int,Int) -> Int = {u,i -> u + i}
    //fun op declarada com lambda informando os tipos das vars
    operator2(10,20,{x: Int, y: Int-> x + y})
    //fun op declarada com lambda SEM informar os tipos das vars
    operator2(10,20,{x, y -> x + y})

}