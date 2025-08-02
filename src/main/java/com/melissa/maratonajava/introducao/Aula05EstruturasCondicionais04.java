package com.melissa.maratonajava.introducao;

/*Taxable income     |                        |  Tax per bracket
From	                up to and including
€ 0     	            € 34,712	            9.70%
€ 34,713	            € 68,507	            37.35%
€ 68,508		                                49.50%
*/
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstBacket = 9.7 / 100;
        double secondBacket = 37.35 / 100;
        double thirdBacket = 49.50 / 100;
        double taxAmount;

        if (annualSalary <= 34712) {
            taxAmount = annualSalary * firstBacket;
        } else if (annualSalary >= 34713 && annualSalary <= 68508) {
            taxAmount = annualSalary * secondBacket;
        } else {
            taxAmount = annualSalary * thirdBacket;
        }
        System.out.println("Tax ammount: " + taxAmount);
    }
}
