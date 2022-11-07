fun main () {
    println(calcularFactorial(Num1()))
}

fun calcularFactorial (Num1: Int): Int {
    var resultado = 1
    for (i in 1 until Num1+1) {
        resultado *= i
    }
    return resultado
}
