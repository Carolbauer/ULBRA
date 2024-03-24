fun main() {
    val number  = listOf(1,4,6,8,13,15,17,20,22,25)
    val pairNumber = selectEvenNumber(number)
    println("The even numbers are: $pairNumber")

}
fun selectEvenNumber(number: List<Int>): List<Int> {
    return number.filter { it % 2 == 0 }
}