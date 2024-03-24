import java.util.*

fun main(){
    val myString = "Tecnologias móveis"
    println(myString.uppercase())
}
fun String.uppercase(): String {
    return this.uppercase(Locale.getDefault())
}