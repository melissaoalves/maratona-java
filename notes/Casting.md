# Vídeo 12: Casting

Casting é o processo de converter um valor de um tipo de dado para outro.
Nesta aula, aprendi sobre o casting explícito (manual), onde convertemos um tipo "maior" para um tipo "menor". 
Esse tipo de casting pode resultar em perda de dados ou precisão se o valor original for muito grande ou tiver casas decimais que não cabem no tipo de destino.

* `int age = (int) 10000000000L`;
    * Aqui eu tento colocar um `long` (10 bilhões) em um int. O `(int)` indica o casting explícito.
    * Como `10000000000L` excede o valor máximo que um `int` pode armazenar, o resulta é um `overflow`.
* `long bigNumber = (long) 155.23F`
    * Aqui, um `double` é explicitamente convertido para `long`.
    * A parte decimal (`.23`) será cortada, o que resulta em `155`.

##### Next Class: [[OperadoresAritmeticos|Operadores Aritméticos]]