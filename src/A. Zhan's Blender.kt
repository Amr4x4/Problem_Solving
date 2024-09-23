fun main(){

    val numOfTestCases = readln().toInt()
    val results = mutableListOf<Int>()

    for( i in 1..numOfTestCases){
        val numOfFruits = readln().toInt()
        val operationOfMixing = readln().split(" ").map { it.toInt() }

        val mixBlunderCapacity = operationOfMixing[0]
        val canAdd = operationOfMixing[1]
        var result = 0

        if( mixBlunderCapacity <= canAdd ){
            result = numOfFruits/mixBlunderCapacity + if (numOfFruits%mixBlunderCapacity != 0) 1 else 0
        } else{
            result = numOfFruits/canAdd + if (numOfFruits%canAdd != 0) 1 else 0
        }

        results.add(result)
    }

    println(results.joinToString("\n"))
}
