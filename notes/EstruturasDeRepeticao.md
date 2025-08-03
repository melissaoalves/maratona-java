Nesta aula, exploramos as estruturas de repetição (loops), que nos permitem executar um bloco de código repetidamente, o que é fundamental para a automação e processamento de coleções de dados.

- **Loop `while`:**
    - A condição é verificada **antes** de cada execução do bloco de código.
    - O loop continua a ser executado enquanto a condição for `true`. Se a condição for inicialmente `false`, o bloco de código nunca será executado.
- **Loop `do-while`:**
    - A principal diferença para o `while` é que o bloco de código é executado **pelo menos uma vez**, porque a condição é verificada apenas **após** a primeira execução.
    - O loop continua a ser executado enquanto a condição for `true`.
- **Loop `for`:**
    - É a estrutura mais comum para repetições com um número fixo de iterações.
    - Sua sintaxe compacta inclui três partes em um único parêntese, separadas por ponto e vírgula:
        1. **Inicialização:** (`int i = 0;`) Executado apenas uma vez, no início do loop.
        2. **Condição:** (`i < 10;`) Verificada antes de cada iteração.
        3. **Incremento/Decremento:** (`i++`) Executado após cada iteração.