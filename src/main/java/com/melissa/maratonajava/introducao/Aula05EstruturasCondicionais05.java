package com.melissa.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args){
        // Imprima o dia da semana, considerando 1 como domingo
        byte day = 1;
        // char, int, byte, short, enum, String
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char gender = 'M';
        switch(gender){
            case 'M':
                System.out.println("male");
                break;
            case 'F':
                System.out.println("female");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
