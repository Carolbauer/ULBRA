import java.util.*

fun main(){
    val nameString = listOf("Carol", "Bob", "Alice", "Charlie", "David")
    val nameUpperCase = convertToUpperCase(nameString)
    println("The names in uppercase are: $nameUpperCase")
}
fun convertToUpperCase(nameString: List<String>): List<String> {
    return nameString.map { it.uppercase(Locale.getDefault()) }
}