fun bonus(employee: String, exp: Int): Float {
    var bonus: Float = 0f
    if (employee == "Manager") {
        bonus = if (exp < 2) {
            2000f
        } else {
            3000f
        }
    } else if (employee == "Coordinator") {
        bonus = if (exp < 1) {
            1500f
        } else {
            1800f
        }
    } else if (employee == "Software Engineer") {
        bonus = 1000f
    } else if (employee == "Intern") {
        bonus = 500f
    }
    return bonus
}


fun main () {
   println(bonus("Manager", 2))
}




