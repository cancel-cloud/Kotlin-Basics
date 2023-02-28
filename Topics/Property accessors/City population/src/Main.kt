class City(val name: String, population: Int = 0) {
    var population: Int = when {
        population < 0 -> 0
        population > 50_000_000 -> 50_000_000
        else -> population
    }
        set(value) {
            field = when {
                value < 0 -> 0
                value > 50_000_000 -> 50_000_000
                else -> value
            }
        }
}