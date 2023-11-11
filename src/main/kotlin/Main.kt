fun main() {
    var resultado = 0
    var caracterErroneo = ' '

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
                caracterErroneo = entrada[i]
                esValido = false
            }
        }

        i++
    }

    if(!esValido) {
        println("El caracter '$caracterErroneo' no es válido")
    }
}