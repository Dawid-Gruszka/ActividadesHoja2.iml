var aprobados = 0
var suspensos = 0
fun main() {
    pedirNotas()
}
fun pedirNotas (): Int {
    var nota = 0
    do{
    println("Introduzca la nota: ")
    nota = readln().toInt()
    comprobarAprOSus(nota)
    } while (repetir())
    println("$aprobados")
    println("$suspensos")
    return nota
}
fun comprobarAprOSus (pedirNotas: Int) {
    if (pedirNotas >= 5 ) {
        aprobados += 1
    } else {
        suspensos += 1
    }
}