fun main(){
    // Type 1 of solution
    val numOfGames = readln().toInt()
    val results = readln()
    val antonResult = results.toCharArray().filter {  it == 'A'  }.size
    val danikResult = results.toCharArray().filter { it == 'D' }.size
    if( antonResult > danikResult){
        println("Anton")
    } else if( antonResult == danikResult){
        println("Friendship")
    }else{
        println("Danik")
    }

    // Type 2 of solution
    /*
    val numOfGames = readln().toInt()
    val results = readln()
    var antonResult = 0
    var danikResult = 0
    for ( i in 0..< numOfGames){
        if(results.toCharArray()[i] == 'A'){
            antonResult++
        } else{
            danikResult++
        }
    }
    if( antonResult > danikResult){
        println("Anton")
    } else if( antonResult == danikResult){
        println("Friendship")
    }else{
        println("Danik")
    }
    */

}