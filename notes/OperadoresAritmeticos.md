# Vídeo 15: Operadores Aritméticos

Nesta aula, revisei sobre operadores aritméticos básicos e como eles se comportam no Java.

* `+`: adição
* `-`: subtração
* `*`: multiplicação
* `/`: divisão

### Divisão:

Na divisão entre dois inteiros (`int/int`) o resultado sempre será um número inteiro, a parte decimal é cortada.  
Já em uma divisão envolvendo um ponto flutuante (`double / int`, `int / double` ou `double / double`), o resultado sempre será um número de ponto flutuante, preservando a parte decimal.

### Precedência e concatenação de strings:

O operador `+` também é usado para concatenação de strings.   
A precedência das operações e a presença de strings afetam o resultado das expressões.
* Exemplo: `"value = " + number1 + number2` concatena tudo
* Exemplo: `(number1 + number2) + "value = "` soma os números primeiro, depois concatena.

##### Next Class: [[OperadoresModuloRelacionais|Operadores Aritméticos (Módulo) e Relacionais]]
