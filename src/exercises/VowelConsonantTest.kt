package exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {

    @Test
    fun countVowels(){
        Assert.assertEquals(11, countVowels("quantas vogais tem esta frase?"))
    }
    @Test
    fun countConsonant(){
        Assert.assertEquals(21, countConsonant("geralmente uma frase possui mais consoantes!"))
    }
    @Test
    fun countVowelsAndConsonants(){
        val phrase = "Estou gostando muito de aprender Kotlin!"
        Assert.assertEquals(15,countVowels(phrase))
        Assert.assertEquals(19,countConsonant(phrase))
    }
}