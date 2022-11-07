fun main () {
   ImprimirNumerosPares(ImprimirNumero())
}

fun ImprimirNumerosPares (ImprimirNumero: Int): Int {
    for (i in 1 .. ImprimirNumero) {
        if (i % 2 == 0) {
            println(i)
        } else {
            println("El numero $i no es par")
        }
    }
    return ImprimirNumero
}

fun ImprimirNumero(): Int {
    println("Dime un Número: ")
    return readln().toInt()
}