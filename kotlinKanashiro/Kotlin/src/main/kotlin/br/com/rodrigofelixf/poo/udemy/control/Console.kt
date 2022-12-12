package br.com.rodrigofelixf.poo.udemy.control

class Console private constructor() {

    companion object {
        fun readInt(msg: String): Int {
            var retorno: Int? = null
            do {
                println(msg)
                val info = readln()

                if (info != null && info != "") {
                    retorno = info.toIntOrNull()
                    if (retorno == null || retorno <= 0) {
                    }
                } else {
                    println("Invalid Value")
                }
            } while (retorno == null || retorno <= 0)
            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null
            do {
                println(msg)
                val info = readln()

                if (info != null && info != "") {
                    retorno = info.lowercase()
                } else {
                    println("Invalid")
                }
            } while (retorno == null)
            return retorno
        }
    }
}