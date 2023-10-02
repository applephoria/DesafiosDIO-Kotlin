fun main() {

    //Variáveis
    var calculo: Float
    val saldo: String
     // Entrada de dados
    val saldoTotal = readLine()!!.toFloat()
    val valorSaque = readLine()!!.toFloat()

    // Condição
        if (valorSaque <= saldoTotal){
        calculo = saldoTotal - valorSaque
        saldo = String.format("%.0f", calculo) // Formata o saldo para não mostrar casas decimais
        println("\nSaque realizado com sucesso! Novo saldo: $saldo")
      }else{
        println("\nSaldo insuficiente. Saque nao realizado!")
      }

  println("\n--- --- --- --- --- --- --\n")
  println("Pressione Enter para sair...")
  readLine() //Recebe ação do teclado para fechar o programa 
}

//Marcel "Maçã " Florentino  - 10:17 25/09/2023