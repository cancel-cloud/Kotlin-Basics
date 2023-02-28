fun main() {
    val read1 = readln().toInt()
    val read2 = readln().toInt()
    val read3 = readln().toInt()
    val read4 = readln().toInt()
    val read5 = readln().toInt()

    val range = read1..read2
    val range2 = read3..read4
    if (range.contains(read5) || range2.contains(read5)) {
        println("true")
    } else {
        println("false")
    }
}