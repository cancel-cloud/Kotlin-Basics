fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = 0.0, y4: Double = 0.0): Double {
    val dist1 = Math.hypot(x2 - x1, y2 - y1)
    val dist2 = Math.hypot(x3 - x2, y3 - y2)
    val dist3 = Math.hypot(x4 - x3, y4 - y3)
    val dist4 = Math.hypot(x1 - x4, y1 - y4)

    return if (x4 == 0.0 && y4 == 0.0) {
        // Triangle
        dist1 + dist2 + Math.hypot(x3 - x1, y3 - y1)
    } else {
        // Quadrilateral
        dist1 + dist2 + dist3 + dist4
    }
}
