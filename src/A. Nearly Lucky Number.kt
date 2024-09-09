fun main() {
    val theNumber = readln().toList()
    val luckyDigitCount = theNumber.count { it == '7' || it == '4' }
    println(luckyDigitCount)
    if (luckyDigitCount.toString().all { it == '7' || it == '4' }) {
        println("YES")
    } else {
        println("NO")
    }
}
