package alves.melissa.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 20;
        double number3 = 30;
        int multiplication = number1*number2;
        double divisionWithInteger = number1/number2;
        double divisionWithDouble = number1/number3;

        System.out.println(number2-number1);
        System.out.println("value = "+number1+number2);
        System.out.println(number1+number2+" value = "+number1+number2);
        System.out.println("Multiplication = "+multiplication);
        System.out.println("Division with two integers = "+divisionWithInteger);
        System.out.println("Division with an integer and a double = "+divisionWithDouble);
    }
}
