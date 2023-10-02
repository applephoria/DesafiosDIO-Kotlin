import java.util.Scanner //O Scanner é uma classe que facilita a leitura de entrada do usuário a partir do console ou de outras fontes
import java.util.Locale // Locale.US foi isando para configurar a formatação de números no código

// Crie uma classe chamada Deposito para o programa.
fun main() {
    // Crie um objeto Scanner para ler entradas do usuário pelo teclado.
    // Usei o Locale.US para que o ponto seja o separador decimal.
    val scanner = Scanner(System.`in`).useLocale(Locale.US)

    // Ler um número de ponto flutuante (double).
    val valor = scanner.nextDouble()

    // Verifique se o valor digitado é maior que zero.
    if (valor > 0) {
        // Se for maior que zero, exiba uma mensagem de depósito bem-sucedido.
        println("Deposito realizado com sucesso!")

        // Usei a função format para formatar a saída com dois dígitos após o ponto decimal,
        // Usei o Locale.US configurado anteriormente para ser ponto em vez de vírgula.
        println(String.format(Locale.US, "Saldo atual: R$ %.2f", valor))
    } else if (valor < 0) {
        // Se for menor que zero, exibe uma mensagem de valor inválido.
        println("Valor invalido! Digite um valor maior que zero.")
    } else {
        // Se for igual a zero, exibe uma mensagem de encerramento.
        println("Encerrando o programa...")
    }

    // Mensagens adicionais
    println("\n--- --- --- --- --- --- --\n")
    println("\nPressione Enter para sair...")
    
    // Aguarda que o usuário pressione Enter para fechar o programa
    readLine() // Recebe ação do teclado para fechar o programa

     // Fecha o Scanner já que não será mais usado
     scanner.close()
}

//Marcel "Maçã " Florentino  - 18:10 - 26/09/2023