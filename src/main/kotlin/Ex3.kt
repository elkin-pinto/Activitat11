package org.example
import java.util.*

fun main() {
    var lista = arrayOf(1,2,3,4,5)
    ordenarLista(lista)
}

fun ordenarLista(lista:Array<Int>):Array<Int> {
    var listaOrdenada = lista
    var lista1:Array<Int> = arrayOf()
    var lista2:Array<Int> = arrayOf()
    for (i in lista.indices) {
        if (i < (lista.size / 2)) lista1 += lista[i]
        else lista2 += lista[i]
    }
    for (i in lista2) println(i)
    return listaOrdenada
}

fun ordenarListasOrdenadas(lista1:Array<Int>,lista2:Array<Int>):Array<Int> {
    var listaFinal:Array<Int> = arrayOf()
    var x = 0
    var y = 0
    for (i in 0 until (lista1.size + lista2.size)) {
        if (x != lista1.size && y != lista2.size) {
            if (lista1[x] < lista2[y]) {
                listaFinal += lista1[x]
                x++
            }
            else {
                listaFinal += lista2[y]
                y++
            }
        }
        else if (x == lista1.size) {
            listaFinal += lista2[y]
            y++
        }
        else {
            listaFinal += lista1[x]
            x++
        }
    }
    return listaFinal
}