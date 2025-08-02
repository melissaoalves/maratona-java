package com.melissa.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
// Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
// Conseiderando 1 como domingo
    public static void main(String[] args) {
        byte day = 5;

        switch (day){
            case 1:
            case 7:
                System.out.println("weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
