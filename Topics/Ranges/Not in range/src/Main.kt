fun main() {
    val range = 1..11
    val inputNumber = readln().toInt()
    if (range.contains(inputNumber)) {
        println("false")
    } else {
        println("true")
    }
}