
fun main() {
    val n = readln().toInt()

    val luckyNumbers = mutableListOf<Int>()
    for (i in 1..1000) {
        if (isLucky(i)) {
            luckyNumbers.add(i)
        }
    }
    val isAlmostLucky = luckyNumbers.any { n % it == 0 }
    println(if (isAlmostLucky) "YES" else "NO")
}

fun isLucky(num: Int): Boolean {
    var temp = num
    while (temp > 0) {
        val digit = temp % 10
        if (digit != 4 && digit != 7) {
            return false
        }
        temp /= 10
    }
    return true
}
