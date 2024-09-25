fun main(){
    val testCases = readln().toInt()
    val results = mutableListOf<String>()
    for( i in 1..testCases){
        val inputLine = readln().split(" ").map { it.toInt() }
        var sortedResult = ""
        sortedResult += if( inputLine[0] < inputLine[1] ){
            (""+inputLine[0] + " " + inputLine[1])
        } else{
            (""+inputLine[1] + " " + inputLine[0])
        }
        results.add(sortedResult)
    }
    println(results.joinToString("\n"))
}