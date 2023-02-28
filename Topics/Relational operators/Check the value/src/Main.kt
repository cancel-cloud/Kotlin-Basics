fun main() {
    val entered = readLine()?.toInt() ?: 0
    val result = if (entered in 1..9) true else false
    println(result)
}