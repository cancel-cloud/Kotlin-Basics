fun main() {
    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14
    val isWorkTime = time in workTime
    if (isWorkTime && time !in lunchTime) {
        println("true")
    } else {
        println("false")
    }
}