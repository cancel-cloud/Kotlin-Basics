// write your code here

/* Do not change code below */
fun main() {
    val readInput = readln().toInt()
    println(getLastDigit(readInput))
}

fun getLastDigit(wholeNumber: Int): Int {

        val positiveNumber = kotlin.math.abs(wholeNumber)
        return positiveNumber % 10

}