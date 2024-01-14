import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows

class LaboratoriRatolinsTest {

    @Test
    fun calcularParejasRatones_unMes_retornaUno() {
        val laboratori = LaboratoriRatolins()
        assertEquals(1, laboratori.calcularParellesRatolins(1))
    }

    @Test
    fun calcularParejasRatones_cincoMeses_retornaCinco() {
        val laboratori = LaboratoriRatolins()
        assertEquals(5, laboratori.calcularParellesRatolins(5))
    }

    @Test
    fun calcularParejasRatones_mesesNegativos_lanzaExcepcion() {
        val laboratori = LaboratoriRatolins()
        assertThrows(IllegalArgumentException::class.java) {
            laboratori.calcularParellesRatolins(-1)
        }
    }
}
