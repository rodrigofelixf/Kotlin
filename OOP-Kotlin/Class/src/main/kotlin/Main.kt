class Person(val age: Int, var name: String) {
    var doc: String? = null

    constructor(age: Int, name: String, doc: String) : this(age, name) {
        this.doc = doc
    }


    fun sleep() {
        println("Sleeping")
    }

    fun wakeUp() {
        println("Wakening")
    }




}

fun main() {

    var person: Person = Person(28, "Rodrigo")

    person.sleep()

}