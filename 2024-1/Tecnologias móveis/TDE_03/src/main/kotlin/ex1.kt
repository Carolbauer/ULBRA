fun main() {
    val number = listOf(10, 20, 30, 40, 50)
    val average = calculateAverage(number)
   println("The average is: $average")
}

fun calculateAverage(number: List<Int>): Double {
    if (number.isEmpty()) {
        return 0.0
    }

    val total = number.sum()
    return total.toDouble() / number.size
}
