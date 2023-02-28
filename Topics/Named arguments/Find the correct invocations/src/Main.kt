// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    fun checkEqual(s1: String, s2: String, ignoreCase: Boolean = false): Boolean {
        return if (ignoreCase) s1.toLowerCase() == s2.toLowerCase() else s1 == s2
    }

    checkEqual("abc", "ABC", ignoreCase = true)
    checkEqual(s1 = "abc", s2 = "aBc", true)
    checkEqual(ignoreCase = true, "abc", "ABC")
    checkEqual(s2 = "abc", s1 = "aBc")
}
