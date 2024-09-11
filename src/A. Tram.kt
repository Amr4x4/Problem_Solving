fun main(){

    val numOfStops = readln().toInt()
    val lisOfExitAndEnter:MutableList<MutableList<Int>> = mutableListOf()



    for( i in 0..< numOfStops){
        val row = readln().split(" ").map { it.toInt() }.toMutableList()
        lisOfExitAndEnter.add(row)
    }

    var currantPassenger = 0
    var capcity = 0

    for( i in 0..< numOfStops ){
        currantPassenger = ( currantPassenger - lisOfExitAndEnter[i][0] ) + lisOfExitAndEnter[i][ 1 ]

        if( currantPassenger > capcity)
            capcity = currantPassenger
    }

    println(capcity)
}