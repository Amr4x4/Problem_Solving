
fun main(){
    val numOfPeople = readln().toInt()
    val theirOpinion = readln().split(" ").toList()

    val easyThinker = theirOpinion.filter { it == "0" }

    if(easyThinker.size == numOfPeople ){
        println("EASY")
    } else{
        println("HARD")

    }
}