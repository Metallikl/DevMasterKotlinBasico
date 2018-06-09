package moreclasses

class Repository{
    fun execute(){}
}

class Business{
    /**
     * LATEINIT -
     * Usanso o lateinit, indicamo que a variavel será inicializada posteriormente
     * e assim o Kotlin assume o valor null para essa variavel até sua inicialização.
     * Como essa variavel terá o valor internamente setado para null e depois uma atribuição,
     * as varaiveis com lateinit TEM QUE SER VAR E NÃO VAL, uma vez que o valor será trocado.
     * OBS: O lateinit, só funciona com variaveis como tipos que não são primitivos pois,
     * para os primitivos, podemos facilmente atribuir um valor default.
     */

    //A linha abaixo representa basicamente o que o Kotlin faz quando a var é
    //marcada com lateinit, porem , usando o late init, não é necessario ficar usando
    //sempre o ? na chamada dos metodos, pois o Kotlin sabe que
    //o valor só será nulo até usa inicialização.
    val repo1 : Repository? = null
    lateinit var repo2 : Repository//
    //lateinit var value: Int//erro pois lateinit não pode ser usado com primitivos

    fun execute(){
        repo2 = Repository()
    }
}


fun main(args: Array<String>) {

}