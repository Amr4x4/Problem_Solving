fun main(){
    val vasyaWords = readln()

    var theWordAfterNoRepeat = ""
    val targetedWord = "hello"
    var counter = 0
    for( i in vasyaWords.indices){
        if(counter == targetedWord.length){
            break
        }
        if(vasyaWords[i] == targetedWord[counter]){
            theWordAfterNoRepeat += vasyaWords[i]
            counter++
        }
    }

    if( theWordAfterNoRepeat == targetedWord){
        println("YES")
    } else {
        println("NO")
    }
}