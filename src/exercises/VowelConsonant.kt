package exercises

val VOWELS = listOf("a","e","i","o","u")
val CONSONANTS = listOf(
        "b","c","d","f", "g","h","j","k","l","m",
        "n","p","q","r","s","t","w","y","v","x","z"
)

fun countVowels(str: String): Int{
    var counter = 0
    str.forEach { s->
        if(VOWELS.contains(s.toLowerCase().toString())){
            counter ++
        }
    }
    return counter
    //Resolução do professor \/
//    val vowels = "aeiou"
//    var totalVowels = 0
//    //
//    for (letter in str){
//        if(letter.toLowerCase() in vowels) totalVowels++
//    }
//    return totalVowels
}

fun countConsonant(str: String): Int{
    var counter = 0
    str.forEach { s->
        if(CONSONANTS.contains(s.toLowerCase().toString())){
            counter ++
        }
    }
    return counter
    //Resolução do professor \/
//    val consonants = "bcdfghjklmnpqrstwyvxz"
//    var totalConsonants = 0
//    //
//    for (letter in str){
//        if(letter.toLowerCase() in consonants) totalConsonants++
//    }
//    return totalConsonants
}