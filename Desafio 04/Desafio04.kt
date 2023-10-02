// Importamos a função pow da biblioteca kotlin.math, que será usada para cálculos de potência
import kotlin.math.pow

// Função para calcular o valor final do investimento
fun calculo(valorInicial: Double, taxaJuros: Double, periodo: Int): Unit {
    // Calcula o valor final do investimento com juros compostos
    val total = valorInicial * (1 + taxaJuros).pow(periodo)

    // Formata o valor final com duas casas decimais e um ponto como separador decimal
    val valorFinalFormatado = String.format("%.2f", total).replace(',', '.')

    // Imprime o valor final do investimento formatado com a mensagem
    println("\nValor final do investimento: R$ $valorFinalFormatado\n")
}

fun main() {
    // Leitura das entradas do usuário para valor inicial, taxa de juros e período
    val valorInicial = readLine()!!.toDouble()  // Lê o valor inicial do investimento como Double
    val taxaJuros = readLine()!!.toDouble()    // Lê a taxa de juros como Double
    val periodo = readLine()!!.toInt()             // Lê o período de tempo como Int (número inteiro de anos)

    // Chamada da função 'calculo' para calcular e exibir o valor final do investimento
    calculo(valorInicial, taxaJuros, periodo)

    // Mensagens adicionais
    println("\n--- --- --- --- --- --- --\n")
    println("\nPressione Enter para sair...")
    
    // Aguarda que o usuário pressione Enter para fechar o programa
    readLine() // Recebe ação do teclado para fechar o programa
}

//Marcel "Maçã " Florentino  - 11:30 25/09/2023