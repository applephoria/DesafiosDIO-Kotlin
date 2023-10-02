fun main() {

    println("Digite a quantidade de ativos: ")
    val quantidadeAtivos = readLine()!!.toInt() // Variável que vai ser usada no Loop FOR 

    val ativos = mutableListOf<String>()

    for (i in 1..quantidadeAtivos) {

        // Uso o dado do i para aparecer 1° 2° e 3° ativo 
        println("Digite o ${i}° ativo: ")
        // Converte toda a string em minuscula, depois seleciona o primeiro caracter da string e coloca e maiusculo 
        val ativo = readLine()!!.lowercase().replaceFirstChar { it.uppercase() }
        ativos.add(ativo)
    } // Fim FOR

    // Ordena a lista de ativos em ordem alfabética
    ativos.sort()

    // Exibe os dados
    println("\nLista de ativos em ordem alfabética:")
    for (ativo in ativos) {
        println(ativo)
    } // Fim FOR

    println("\n--- --- --- --- --- --- --\n")
    println("\nPressione Enter para sair...")
    readLine() //Recebe ação do teclado para fechar o programa 
}

//Marcel "Maçã " Florentino  - 09:20 25/09/2023