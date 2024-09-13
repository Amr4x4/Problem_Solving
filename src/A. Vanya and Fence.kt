fun main(){
    val inputLine = readln().split(" ").toList()
    val numberOfPersons = inputLine[0].toInt()
    val fenceHeight  = inputLine[1].toInt()

    val friendsHeight = readln().split(" ").toList().map { it.toInt() }

    var theResult = 0
    for( i in friendsHeight.indices){
        if(friendsHeight[i] > fenceHeight ) {
            theResult += (friendsHeight[i] / fenceHeight) + if( friendsHeight[i] % fenceHeight != 0 ) 1 else 0
            continue
        }
       theResult++
    }

    println(theResult)
}