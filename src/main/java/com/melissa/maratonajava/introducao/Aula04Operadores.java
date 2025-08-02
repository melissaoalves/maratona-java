package com.melissa.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - * /
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

        // %
        int remainderZero = 21 % 7;
        int remainder = 21 % 2;

        System.out.println("The remainder is " + remainderZero);
        System.out.println("The remainder is " + remainder);

        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessGreaterThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenNotEqualToTen = 10 != 10;

        System.out.println("is ten greater than twenty? " + isTenGreaterThanTwenty);
        System.out.println("is ten less than twenty? " + isTenLessGreaterThanTwenty);
        System.out.println("is ten equal to twenty? " + isTenEqualToTwenty);
        System.out.println("is ten equal to ten? " + isTenEqualToTen);
        System.out.println("is ten not equal to ten? " + isTenNotEqualToTen);

        // && (AND) || (OR) !
        int age = 29;
        float salary = 3500F;
        boolean isLegalGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("Is legal and greater than thirty? " + isLegalGreaterThanThirty);
        System.out.println("Is legal and less than thirty? " + isLegalLessThanThirty);

        double checkingAccountBalance = 200;
        double savingsAccountBalance = 10000;
        float playstationFiveValue = 5000F;
        boolean isPlaystationFivePurchasable = checkingAccountBalance > savingsAccountBalance || savingsAccountBalance > playstationFiveValue;
        System.out.println("is playstation 5 purchasable? "+ isPlaystationFivePurchasable);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println("Bonus: "+bonus);
        bonus -= 1000;
        System.out.println("Bonus: "+bonus);
        bonus *= 2;
        System.out.println("Bonus: "+bonus);
        bonus /= 2;
        System.out.println("Bonus: "+bonus);
        bonus %= 2;
        System.out.println("Bonus: "+bonus);

        int count = 0;
        count += 1;
        count++;
        System.out.println(count);
        count--;
        System.out.println(count);
        ++count;
        --count;
        System.out.println(count);
        int count2 = 0;
        System.out.println(++count2);
        int count3 = 0;
        System.out.println(count3++);
    }
}
