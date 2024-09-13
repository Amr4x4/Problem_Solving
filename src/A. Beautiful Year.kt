fun main() {
    var year = readln().toInt()

    while (true) {
        year++
        val digits = year.toString().toList()

        if (digits.size == digits.toSet().size) {
            println(year)
            break
        }
    }
}
