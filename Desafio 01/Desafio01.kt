fun calcularSaldoAtualizado(saldoAtual: Float, valorDeposito: Float, valorRetirada: Float): String {
    val total = (saldoAtual + valorDeposito) - valorRetirada
    
    // Utilizei o método 'format' para formatar 'total' com uma casa decimal na saída
    // Como solicitado na REGRA DE FORMATAÇÃO.
    return "\nSaldo atualizado na conta: %.1f\n".format(total)
}

fun main() {
    // Leitura do saldo atual
    print("Entre com o saldo atual: ")
    val saldoAtual = readLine()!!.toFloat()

    // Leitura do valor do depósito
    print("Entre com o valor do depósito: ")
    val valorDeposito = readLine()!!.toFloat()

    // Leitura do valor da retirada
    print("Qual é o valor da retirada? ")
    val valorRetirada = readLine()!!.toFloat()

    // Chama a função para calcular o saldo atualizado e imprimir a string formatada
    println(calcularSaldoAtualizado(saldoAtual, valorDeposito, valorRetirada))

    println("\n--- --- --- --- --- --- --\n")
    println("\nPressione Enter para sair...")
    readLine() //Recebe ação do teclado para fechar o programa 
} // Fim da Função Main

//Marcel "Maçã " Florentino - 08:30 - 25/09/2023