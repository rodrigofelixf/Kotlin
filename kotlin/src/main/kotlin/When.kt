fun bonus(employee: String): Float {
    return when (employee) {
        "Manager" -> 2000f
        "Coordinator" -> 1500f
        "Software engineer" -> 1000f
        "Intern" -> 500f
        else -> 0f
    }
}


fun main() {
    println(bonus("Manager"))

}
