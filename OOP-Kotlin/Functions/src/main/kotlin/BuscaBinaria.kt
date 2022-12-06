fun main() {
    // Vetor Final definido
    val myArray  = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100)

    // Uso da funcao onde foi criado o algoritmo
    print(" elemento esta na posicao ${busca(myArray, 100, 0, myArray.size-1)}")
}

    /* Funcao criada usando a logica do algoritmo de busca binaria
    usei a complexidade do logaritmo que explicarei a seguir da imagem.
     */

fun busca( vector: IntArray, index: Int, inicio: Int, fim :Int): Int {
    println(" $inicio, $fim")

    var meio = ((fim + inicio) / 2)


    if (fim < inicio) return -1

    if (vector[meio] == index) return meio
    else if (index > vector[meio]) return busca(vector, index, meio + 1, fim)
    else return busca(vector, index, inicio, meio - 1)
}