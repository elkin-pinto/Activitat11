package org.example
import java.util.*
import kotlin.math.floor


/**
 * La funcion main junta todas las funciones ademas de hacer el trabajo de enteractuar con el usuario
 *
 * @see comporbarInt comprueba que el input es un Int
 * @see crearTablero crea un matriz con un contenido aleatorio entre 0 y 1
 * @see mostrarTablero muestra el la matriz como si fuera una quadricula
 * @see cambiarRegion dependiendo de una posicion x,y cambia todas las casillas del mismo valor que tenga en contacto, recursivamente.
 */
fun main() {
    val scan = Scanner(System.`in`)
    println("Escribe un numero del 3 al 20 para establecer el tamaño del tablero: ")
    var medida:Int
    do { medida = comporbarInt(scan,"Escribe un numero dentro de las medidas: ") } while (medida in 3..20)

    val matriz = crearTablero(medida)

    mostrarTablero(matriz)

    println("\nAhora tendras que decir las coodenadas de una casilla de la region que quieres cambiar")

    println("Di la coodenada x: ")
    var x:Int
    do { x = comporbarInt(scan,"Escribe un numero dentro de las medidas del tablero: ") } while (x in 1 .. medida)

    println("Di la coodenada y: ")
    var y:Int
    do { y = comporbarInt(scan,"Escribe un numero dentro de las medidas del tablero: ") } while (y in 1 .. medida)

    println("-------------------")

    x += 1
    y -= 1

    cambiarRegion(matriz,x,y,matriz[y][x])
    mostrarTablero(matriz)
}

/**
 * Es una funcion recursiva que dependiendo de una posision de una matriz compueba, como si fuera una quadricula, si las casillas contiguas tienen el mismo valor,
 * para cambiar el valor de todas las casillas contiguas del mismo valor a 2
 *
 * @param matriz es la matriz donde hara los cambios
 * @param x coodenada x
 * @param y coodenada y
 * @param casilla es el valor de la casilla zero, o sea la primera casilla
 */
fun cambiarRegion(matriz: Array<Array<Int>>, x:Int, y:Int, casilla:Int) {
    if (matriz[y][x] != 2) {
        matriz[y][x] = 2
        if (x > 0) if (matriz[y][x - 1] == casilla) cambiarRegion(matriz,x -1,y,casilla)
        if (x < matriz[y].lastIndex) if (matriz[y][x + 1] == casilla) cambiarRegion(matriz,x +1,y,casilla)
        if (y > 0) if (matriz[y - 1][x] == casilla) cambiarRegion(matriz,x,y -1,casilla)
        if (y < matriz.lastIndex) if (matriz[y + 1][x] == casilla) cambiarRegion(matriz,x,y +1,casilla)
    }}


/**
 * Esta funcion muestra una matriz que le pasamos por terminal.
 *
 * @param matriz es la matriz que mostrara.
 */
fun mostrarTablero(matriz:Array<Array<Int>>) {
    for (i in matriz.indices){
        for (e in matriz[i].indices) print("${matriz[i][e]} ")
        println("")
    }
}

/**
 * Esta funcion crea una matriz con las medidas que le pasamos y pone 0 o 1 aleatoriamente dentro de ella.
 *
 * @param medida es un Int que dicta el tamaño del tablero
 */
fun crearTablero(medida:Int):Array<Array<Int>> {
    val matriz = Array (medida) { Array (medida) { 0 } }

    for (i in matriz.indices) {
        for (e in matriz[i].indices) {
            val random = floor((Math.random()*10)/5).toInt()
            matriz[i][e] = random
        }
    }
    return matriz
}

/**
 * Comprueba que el valor introducido por el usuario és in Int.
 *
 * @param scan un scanner
 * @param err es un mensaje de error
 */
fun comporbarInt(scan:Scanner,err:String):Int {
    while (!scan.hasNextInt()) {
        scan.nextLine()
        println(err)
    }
    return scan.nextInt()
}