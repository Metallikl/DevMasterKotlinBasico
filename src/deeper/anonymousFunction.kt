package deeper

fun operator3(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}

fun semNome(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun main(args: Array<String>) {
    //Aqui usamos a função anonima, declarando o fun no lugar do param.
    //Dessa forma, podemos escrever varias linhas de codigo dentro da função,
    //diferentemente do lambda onde só podemos usar instruções simples
    operator3(1, 2, fun(n1: Int, n2: Int): Int {
        return n1 + n2
    })
    //
    operator3(1, 2, ::semNome)
}