class Animal (var specie: String){
    var song: String? = null
    init {
        if (specie == "Dog")
            this.song = "Au, Au!"
    }

    fun songs() {
        println(this.song)
    }
}

fun main() {
    var an: Animal = Animal("Dog")
    an.songs()

}