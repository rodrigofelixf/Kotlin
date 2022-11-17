fun main(args: Array<String>) {
    val num1 = 42.toFloat(); // transformando o tipo da variavel para float
    val num2 = num1.toDouble(); // transformando o tipo da variavel para double


    val distToMoon = 92_960_000;// Organizando com Underline

    val nome: String =  "Rodrigox";

    if (nome == "Rodrigo") print("Igual") else println("$nome")

    fun somar(a: Int, b: Int): Int {
        val soma = a + b;
        return soma;

    }

    println(somar(5, 5))


    val count: Int = 50;
    val answerString: String = if (count == 42) {
        "I have the answer."
    } else if (count > 35) {
        "The answer is close."
    } else {
        "The answer eludes me."
    }
    println(answerString)


    for (x in 1..10 step 2) {
        println(x);
    }

    val items: Array<String> = arrayOf("orange", "apple")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}