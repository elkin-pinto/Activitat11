/**
 * Classe que modela el problema del laboratori de ratolins.
 *
 * Aquesta classe proporciona una implementació per calcular la quantitat de parelles de ratolins
 * després d'un nombre de mesos donat, seguint el patró de la seqüència de Fibonacci.
 */
class LaboratoriRatolins {

    /**
     * Funció que calcula la quantitat de parelles de ratolins després d'un nombre de mesos donat.
     *
     * @param meses Número de mesos per calcular la quantitat de parelles de ratolins.
     * @return Quantitat de parelles de ratolins després dels mesos donats.
     */
    fun calcularParellesRatolins(mesos: Int): Int {
        if (mesos <= 0) {
            //control de dades errónies
            throw IllegalArgumentException("El nombre de mesos ha de ser més gran que zero.")
        }

        var parelles = 1
        var parellesFertils = 0

        for (i in 1..mesos) {
            val novesParelles = parellesFertils
            parellesFertils = parelles
            parelles += novesParelles
        }

        return parelles
    }
}

/**
 * Funció principal que utilitza la classe LaboratoriRatolins per calcular i mostrar la quantitat de parelles de ratolins.
 *
 * Aquesta funció crea una instància de [LaboratoriRatolins], calcula la quantitat de parelles de ratolins per
 * diferents períodes de temps i mostra els resultats a la consola.
 */
fun main() {
    val laboratori = LaboratoriRatolins()

    val mesos1 = 12 // Un any
    val resultat1 = laboratori.calcularParellesRatolins(mesos1)
    println("Després de $mesos1 mesos, hi ha $resultat1 parelles de ratolins.")

    val mesos2 = 24 // Dos anys
    val resultat2 = laboratori.calcularParellesRatolins(mesos2)
    println("Després de $mesos2 mesos, hi ha $resultat2 parelles de ratolins.")

    // Podeu provar amb altres valors de mesos segons sigui necessari.
}
