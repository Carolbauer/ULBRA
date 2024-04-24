fun main(){
    val p1 = Pessoa(name = "Alice", cpf = "123.456.789-00")
    val p2 = Pessoa(name = "Alice", cpf = "123.456.789-00")

    if (p1 == p2) {
        println("Pessoas são iguais")
    } else {
        println("Pessoas são diferentes")
    }
}
data class Pessoa(val name: String, val cpf: String)