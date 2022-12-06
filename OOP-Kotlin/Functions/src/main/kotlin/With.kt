class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")
    }

    // Alternative with RUN

    configuration.run {
        println("$host:$port")
    }
}
