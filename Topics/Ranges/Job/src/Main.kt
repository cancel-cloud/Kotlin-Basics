fun main() {
    val age = readln().toInt()
    val canGetJob = age in 18..59
    println(canGetJob)
}