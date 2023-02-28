fun main() {
    val input = readlnOrNull() ?: "zero"
    val numbers = arrayListOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    if (!numbers.contains(input)) {
        println("Please enter a number (one-nine)")
    } else {
        println(numbers.indexOf(input) + 1)
    }
}