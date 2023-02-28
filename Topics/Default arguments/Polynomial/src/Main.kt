fun polynomial(x: Int, c: Int, b: Int = 0, a: Int = 0): Int {
    return when {
        a != 0 -> a * x * x + b * x + c
        b != 0 -> b * x + c
        else -> c
    }
}
