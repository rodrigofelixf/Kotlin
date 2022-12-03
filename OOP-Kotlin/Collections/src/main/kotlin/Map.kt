fun main() {


    val map1 = mapOf<String, String>(Pair("France", "Paris"), Pair("Germany", "Berlin"))
    val map2 = mutableMapOf<String , String>(Pair("France", "Paris"), Pair("Germany", "Berlin"))

    println(map1)
    map2["Brasil"] = "Brasilia"
    println(map2.toSortedMap())
}