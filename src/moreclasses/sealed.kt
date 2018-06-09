package moreclasses


//Para que uma classe possa ser herdade,
// é necessario colocar a palavra reservada OPEN antes do class ,
//pois, diferentemente do java, por padrão, nenhuma classe pode ser herdada.
//Porem , ao usar o open, significa q qualquer classe , em qualquer pacote e projeto
//pode herdaar dessa classe.
open class Result{
    class Success(val message: String) :Result()
    class Error(val message: String, val errorCode: Int) :Result()

}
//Usando a palavra reservada SEALED, indicamos que essa classe pode ser herdada,
//POREM SOMENTE POR CLASSES DESTE ARQUIVO.
sealed class Result2{
    class Success(val message: String) :Result2()
    class Error(val message: String, val errorCode: Int) :Result2()

}

class Repo{
    fun execute(): Result2{
        //return Result2.Success("Deu Certo")
        return Result2.Error("Deu ruim",404)
    }
}

fun main(args: Array<String>) {
    val r1 = Repo()
    //
    val result =r1.execute()
    //
    when(result){
        is Result2.Success ->{
            println("Sucesso")
        }
        is Result2.Error ->{
            println("Erro")
        }
    }
}