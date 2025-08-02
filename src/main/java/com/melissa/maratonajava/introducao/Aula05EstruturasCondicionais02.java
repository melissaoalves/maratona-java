package com.melissa.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        // age < 15 junior category
        // age >= 15 && age < 18 youth category
        // age >= 18 adult category
        int age = 15;
        String category;
        if(age < 15){
            category = "Junior category";
        } else if(age >= 15 && age < 18){
            category = "Youth category";
        } else{
            category = "Adult category";
        }
        System.out.println(category);
    }
}
