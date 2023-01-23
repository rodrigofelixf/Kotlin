class Personagem(var nome: String = "",
                 var idade: Int = 0,
                 var nave: String = "",
                 val amigos: MutableList<Personagem> = mutableListOf()
) {

    fun comIdade(novaIdade: Int) = this.apply { idade = novaIdade}
    fun comNave(novaNave: String) = this.apply { nave = novaNave }

    fun fazAniversario() : Personagem {
        idade++
        return this
    }

    fun adicionaAmigo(personagem: Personagem?) {
        personagem?.let {
            amigos.add(personagem)
        }

    }

    override fun toString() = "${this.nome} tem ${this.idade} anos e pilota ${this.nave}."

}

fun Personagem.imprime() {
    println(this)
}

fun Personagem.listaAmigos() {
    this.amigos.forEach {
        println(it.nome)
    }
}

fun main(args:Array<String>){

    val luke = Personagem("Luke Skywalker", 19, "X-wing") // 0
    val han = Personagem("Han Solo", 30, "Millenium Falcon") // 1
    val vader = Personagem("Darth Vader", 40, "TIE Interceptor")// 2
    val obiWan = Personagem("Obi-wan Kenobi", 60, "Jedi Starfighter") // 3





}