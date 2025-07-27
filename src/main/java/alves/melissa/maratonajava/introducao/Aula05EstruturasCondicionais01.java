package alves.melissa.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args){
        int age = 17;
        boolean isAllowedToBuyAlcohol = age >= 18;
        if (isAllowedToBuyAlcohol){
            System.out.println("Legally old enough to buy alcohol.");
        } else{
            System.out.println("Not legally old enough to buy alcohol.");
        }
        // !
        if (!isAllowedToBuyAlcohol){
            System.out.println("Not legally old enough to buy alcohol.");
        }
        System.out.println("Outside the if block");
    }
}
