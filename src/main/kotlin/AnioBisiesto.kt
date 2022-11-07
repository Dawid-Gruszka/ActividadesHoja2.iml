fun main() {
    calcularAnio()
}
fun calcularAnio() {
    do {
        println("Introduce un año")
        val anio = readln().toInt()

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            println("El año es bisiesto")
        } else {
            println("El año no es bisiesto")
        }
    } while(repetir())
}

fun repetir(): Boolean {

    val salir = "n"
    var salida = false

    println("¿Quieres seguir? (S/N)")
    val decision = readln()

    salida = decision != salir
    return salida
}
