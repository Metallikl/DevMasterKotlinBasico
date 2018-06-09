package moreclasses

class Car(val modelo: String, val maxSpeed: Int) {

    var currentSpeed: Int = 0
    //o private abaixo, declarado como o private antes, impede atribuião de
    //valor fora da class. Mesma coisa que a variavel ser private.
    //private set(value){}
        set(value) {
            if (value > maxSpeed) {
                throw Exception("Velocidade maior do que a permitida")
            } else {
                /**Dentro do get e set, não podemo atribuir ou retornar o valor do atributo
                //diretamente, pois,dessa forma, estamos chamando implicitamente,
                //o metodo set ou get e o programa entrará em loop.
                //linha abaxio\/
                //     this.currentSpeed = value
                //Para setar ou resgatar valor nos metoo get e set,
                //usamos a palavra reservada field.*/
                field = value//modo correto de atribuir, usando a palavra field
            }
        }
        get() {
            //Linha abaixo errada, gera loop infinito
            // return this.currentSpeed //essa linha esta incorreta, gera loop infinito
            return field //form correta, usando o field.
        }
}


fun main(args: Array<String>) {

    val c1 = Car("Ferrari", 220)
    //
    c1.currentSpeed = 50
    //
    println(c1.currentSpeed)

}