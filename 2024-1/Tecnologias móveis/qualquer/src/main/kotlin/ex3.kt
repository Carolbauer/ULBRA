fun main(){
    val number  = listOf(1,4,4,8,13,15,15,20,20,25)
    val duplicateNumber = deleteDuplicateNumber(number)
    println("The duplicate numbers are: $duplicateNumber")
}
fun deleteDuplicateNumber(number: List<Int>): List<Int> {
    return number.distinct()
}