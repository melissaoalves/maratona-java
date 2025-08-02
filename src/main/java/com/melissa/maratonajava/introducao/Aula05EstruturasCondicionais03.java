package com.melissa.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        double salary = 3000;
        String donationMessage = "I'm going to donate 500 to DevDojo";
        String noDonationMessage = "I'm not in a position to donate yet, but I will be!!";
        // (condition) ? true : false
        String result = salary > 5000 ? donationMessage : noDonationMessage;
        System.out.println(result);
    }
}
