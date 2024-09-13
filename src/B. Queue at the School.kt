fun main(){

    val input = readln().split(" ").toList().map { it.toInt() }
    val numberOfStudents = input[0]
    val time = input[1]
    val lineStructureForm = readln().toMutableList()

    for( i in 1..time){
        var j = 0
        while ( j < numberOfStudents - 1 ){
            val temp = lineStructureForm[j]
            if( lineStructureForm[j] == 'B' && j+1 != numberOfStudents && lineStructureForm[j+1] == 'G' ){
                lineStructureForm[j] = lineStructureForm[j+1]
                lineStructureForm[j+1] = temp
                j++
            }
            j++
        }
    }
    println(lineStructureForm.joinToString(""))
}
