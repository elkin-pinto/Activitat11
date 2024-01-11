import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Ex1KtTest {

    @Test
    fun cambiarRegion() {
        var matriz =
            arrayOf(
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,0),
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,0),
                arrayOf(1,0,1,0,0),
            )
        var result =
            arrayOf(
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,2),
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,0),
                arrayOf(1,0,1,0,0),
            )
        org.example.cambiarRegion(matriz,4,1,matriz[1][4])
        assertArrayEquals(result, matriz)

        matriz =
            arrayOf(
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,0),
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,0),
                arrayOf(1,0,1,0,0),
            )
        result =
            arrayOf(
                arrayOf(2,0,1,1,1),
                arrayOf(2,0,0,1,0),
                arrayOf(2,0,1,1,1),
                arrayOf(2,0,0,1,0),
                arrayOf(2,0,1,0,0),
            )
        org.example.cambiarRegion(matriz,0,0,matriz[0][0])
        assertArrayEquals(result, matriz)

        matriz =
            arrayOf(
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,0),
                arrayOf(1,0,1,1,1),
                arrayOf(1,0,0,1,0),
                arrayOf(1,0,1,0,0),
            )
        result =
            arrayOf(
                arrayOf(1,0,2,2,2),
                arrayOf(1,0,0,2,0),
                arrayOf(1,0,2,2,2),
                arrayOf(1,0,0,2,0),
                arrayOf(1,0,1,0,0),
            )
        org.example.cambiarRegion(matriz,2,0,matriz[0][2])
        assertArrayEquals(result, matriz)
    }
}