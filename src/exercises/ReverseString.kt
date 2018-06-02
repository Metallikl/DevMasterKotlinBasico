package exercises

fun reverseUsingSB(str: String):String{
    val sb: StringBuilder = StringBuilder()
    return sb.append(str).reverse().toString()
    //Resolução do professor \/
    //return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String):String{
    val tot = str.length -1
    var strReverse = ""
    for(i in tot downTo 0 ){
        strReverse+= str[i]
    }
    return strReverse
    //Resolução do professor \/
//    var sbPhrase =  StringBuilder()
//    var i = str.length -1
//    //
//    while(i >= 0){
//        sbPhrase.append(str[i])
//        i--
//    }
//    //
//    return sbPhrase.toString()
}