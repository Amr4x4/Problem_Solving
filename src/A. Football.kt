fun main() {
    val charsInput = readln()
    var counterZeros = 0
    var counterOnes = 0

    for( i in charsInput.indices){
        if(charsInput.toCharArray()[i] == '0' ){
            counterOnes = 0
            counterZeros++
            if(counterZeros >= 7)
                break;
        }
        else {
            counterZeros = 0
            counterOnes++
            if(counterOnes >= 7)
                break;
        }
    }
    if(counterOnes >= 7 || counterZeros >= 7 )
        println("YES")
    else
        println("NO")

}