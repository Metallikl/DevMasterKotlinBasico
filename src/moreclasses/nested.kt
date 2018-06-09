package moreclasses

class Computer(val processorModel: String){

    class Memory{
        fun getMemoryLevel():Int{
            //Impossivel acessar a var da classe superior,
            //pois essa classe é outra classe e não um classe interna de computer
            //println(processorModel)
            return 70
        }
    }


    inner class Memory2{
        fun getMemoryLevel():Int{
            //Aqui é possivel ter acesso ao atributo processorModel , pois é uma
            //classe interna de computer
            println(processorModel)
            return 70
        }
    }

}

fun main(args: Array<String>) {
    //Sendo Memory um outra classe , mas que esta dentro da classe Computer
    //sua inicialização será Computer.Memory(), então acessamos como se fosse um
    //metodo
    val m1: Computer.Memory = Computer.Memory()
    m1.getMemoryLevel()
    //Sendo Memory2 uma classe interna da classe Computer
    //sua inicialização será Computer("var").Memory(). Precisamos primeiro
    //intanciar a classe Computer, inclusive passando o construtor, e somente depois
    //acessar .Memory2
    val m2:Computer.Memory2 = Computer("AMD").Memory2()
    m2.getMemoryLevel()

}