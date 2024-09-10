fun main(){
    // Type 1 solution
    val theBerlandishWord = readln()
    val theBirlandishWord = readln()

    val result = if(theBirlandishWord.reversed() == theBerlandishWord) "YES" else "NO"
    println(result)

    // Type 2 solution
    /*
    val theBerlandishWord2 = readln()
    val theBirlandishWord2 = readln()

    var revers = ""
    for ( i in theBerlandishWord2.length-1 downTo 0){
        revers += theBerlandishWord2.toCharArray()[i].toString()
    }

    val finalResult = if(revers == theBirlandishWord2) "YES" else "NO"
    println(finalResult)
     */
}