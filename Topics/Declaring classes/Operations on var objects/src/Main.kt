// You can experiment here, it won’t be checked

fun main(args: Array<String>) {


    class Plane {
        val canFly: Boolean = true
        var family: String = "Unknown"
    }

    var plane = Plane()
    plane = 5
    plane = Plane()
    plane.canFly = false
    plane.family = "Boeing"


}
