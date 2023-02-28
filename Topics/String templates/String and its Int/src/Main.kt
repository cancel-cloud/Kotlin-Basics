import java.util.Scanner

fun main() {
    val input = readlnOrNull() // read input as a string
    val number = input?.toInt() // convert string to integer
    if (number != null) {
        val result = number / 2 // divide the integer by 2
        println("The obtained value is $number and its Int representation after division on 2 is $result")
    } else {
        println("Invalid input")
    }
}