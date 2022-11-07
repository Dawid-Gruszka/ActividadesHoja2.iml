fun main () {
    SumaImpares(Num1(),preguntar2())

}

fun Num1 (): Int {
    println("Escribe el primer número: ")
    var num1 = readln().toInt()
    return num1
}

fun preguntar2 (): Int {
    println("Escribe el segundo número: ")
    var num2 = readln().toInt()
    return num2
}

fun SumaImpares (Num1:Int, preguntar2:Int) {
    for (i in Num1  until preguntar2) {
        if (i % 2 == 0 ) {
            println("Es par")
        } else {
            var num = i
            var total = num + i
            println(total)
        }
    }
}
