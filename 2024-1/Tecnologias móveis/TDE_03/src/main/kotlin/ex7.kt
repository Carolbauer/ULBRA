fun main(){
    val number = "100"
    val BRL = number.addBRL()
    println("The total in BRL is: $BRL")
}
fun String.addBRL(): String {
    return "R$${this}"
}