enum class Priority (var v: Int) {
    Low(2), Middle(3), High (5)
}

enum class AnimalEnum {
    Dog, Cat, Horse, Cow
}


fun main() {

    for (p in Priority.values())
        println(p.v)

}