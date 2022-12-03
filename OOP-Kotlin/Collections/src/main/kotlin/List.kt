fun main() {
    // Immutable List
    val list1: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Muttable List
    val list2: MutableList<Int> = mutableListOf()


    print(list1.size)
    list2.add(1)


    for (l in list1) println(l)

}

