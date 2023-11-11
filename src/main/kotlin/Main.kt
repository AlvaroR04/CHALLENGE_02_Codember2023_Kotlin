fun main() {
    var resultado = 0

    print("Escriba su código aquí: ")
    val entrada = readln()

    var esValido = true
    var i = 0
    while(i < entrada.length && esValido) {
        when(entrada[i]) {
            '#' -> resultado++
            '@' -> resultado--
            '*' -> resultado *= resultado
            '&' -> print(resultado)
            else -> {
                esValido = false
                println("El caracter '${entrada[i]}' no es válido")
            }
        }
        i++
    }
}