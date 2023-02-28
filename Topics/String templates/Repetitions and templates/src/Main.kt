fun main() {
    val entered = readlnOrNull() ?: "nothing"
    val length = entered.length
    print("$length repetitions of the word $entered: ")
    for (i in 1..length) {
        print(entered)
    }
}