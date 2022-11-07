fun main () {
println(mirar())
}

fun mirar() {

    do {
        println("Introduce un número")
        val num = readln().toLong()

        if (num >= 0) {
            println("El numero es positivo")
        } else {
            println("El numero es negativo")
        }
    } while (repetir())
}
