fun main() {
    val input = readlnOrNull() ?: ""
    if (input.isEmpty()) {
        println(input)
    } else {
        when (input.first()) {
            'i' -> println(input.drop(1).toInt() + 1)
            's' -> println(input.drop(1).reversed())
            else -> println(input ?: "")
        }
    }

}