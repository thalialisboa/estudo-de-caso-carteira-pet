class Vacina(
    val nome: String,
    val mesesParaReforco: Int
)

class HistoricoMedico(
    val vacina: Vacina,
    val dataAplicacao: String,
    val mesesDesdeAplicacao: Int,
    val status: String
) {
    fun estaAtrasada(): Boolean {
        return mesesDesdeAplicacao > vacina.mesesParaReforco
    }
}

class Tutor(
    val nome: String,
    val codigoMicrochip: String?,
    val telefone: String,
    val contatoConfirmado: Boolean
)

fun main() {
    val nomePet = "Caramelo"
    val pesoPet = 8.5

    val tutor = Tutor(
        nome = "Thalia",
        codigoMicrochip = null,
        telefone = "(00) 00000-0000",
        contatoConfirmado = true
    )

    val opcaoVacina = 1

    val vacinaEscolhida = when (opcaoVacina) {
        1 -> Vacina("V10/V8", 12)
        2 -> Vacina("Antiparasitária", 3)
        3 -> Vacina("Gripe Canina", 12)
        4 -> Vacina("Giárdia", 12)
        else -> Vacina("Vacina não identificada", 0)
    }

    val historico = listOf(
        HistoricoMedico(vacinaEscolhida, "10/09/2025", 13, "Aplicada"),
        HistoricoMedico(
            Vacina("Antiparasitária", 3),
            "01/08/2026",
            2,
            "Aplicada"
        ),
        HistoricoMedico(
            Vacina("Gripe Canina", 12),
            "15/09/2025",
            12,
            "Aplicada"
        ),
        HistoricoMedico(
            Vacina("Giárdia", 12),
            "20/07/2025",
            14,
            "Aplicada"
        )
    )

    println("=== CARTEIRA DE VACINAÇÃO DIGITAL ===")
    println("Pet: $nomePet")
    println("Peso: $pesoPet kg")
    println("Tutor: ${tutor.nome}")
    println("Microchip: ${tutor.codigoMicrochip ?: "Animal não microchipado"}")

    if (tutor.contatoConfirmado) {
        println("Contato do tutor confirmado.")
    } else {
        println("Contato do tutor não confirmado.")
    }

    println("\nVacinas registradas:")
    val vacinasPendentes = mutableListOf<String>()

    for (registro in historico) {
        println(
            "- ${registro.vacina.nome} | " +
                    "Aplicada em: ${registro.dataAplicacao} | " +
                    "Status: ${registro.status}"
        )

        if (registro.estaAtrasada()) {
            println("ATENÇÃO: Reforço atrasado! Risco à saúde do animal.")
            vacinasPendentes.add(registro.vacina.nome)
        } else {
            println("Vacina em dia.")
        }
    }

    println("\nVacinas pendentes: $vacinasPendentes")
}