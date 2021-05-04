// Ej1: Busca a todas las personas que no se llaman Sergio pero que tienen una "s" en su nombre.
// Ej2: Busca a todas las personas cuyo nombre tiene un número de letras par.
// Ej3: Busca a todas las personas cuyo nombre tiene un número de letras superior a 6 y que su nombre empieza por vocal.
// Ej4: Busca a todas las personas cuyo nombre tiene que tengan más de 3 vocales distintas.-

val l1 = mutableListOf("Carlos", "Sergio", "Javier", "Ignacio", "Manuel", "Stefanel", "Nestor")
val listaVocales = mutableListOf('A', 'E', 'I', 'O', 'U')
const val NUMEROVOCALES = 5-1

fun main() {
    //Ejercicio1
    val resultadoEj1 = l1.filter{ it.toUpperCase().contains('S') && it.toUpperCase() != "SERGIO" }
    println(resultadoEj1)

    //Ejercicio2
    val resultadoEj2 = l1.filter{ it.length%2 == 0 }
    println(resultadoEj2)

    //Ejercicio3
    var resultadoEj3 = l1.filter{ it.length > 6 }
    resultadoEj3 = resultadoEj3.filter{ it[0].toUpperCase() in listaVocales }
    println(resultadoEj3)

    //Ejercicio4
    val resultadoEj4 = l1.filter{ nombre ->
        var contAuxContadores = 0
        val auxNombre = nombre.toUpperCase()
        val auxContVocales = mutableListOf(false, false, false, false, false)
        auxNombre.forEach { letra ->
            for(i in 0..NUMEROVOCALES){
                if(letra == listaVocales[i]){ auxContVocales[i] = true }
            }
        }
        auxContVocales.forEach { if(it){ contAuxContadores++ } }
        contAuxContadores >= 3
    }
    println(resultadoEj4)
}