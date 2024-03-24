fun main(){
    val number  = listOf(1,4,6,8,13,15,17,20,22,25)
    val oddNumber = selectLastOddNumber(number)
    println("The last odd number is: $oddNumber")

}
fun selectLastOddNumber(number: List<Int>): Int {
    return number.last { it % 2 != 0 }
}