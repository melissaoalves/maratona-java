package alves.melissa.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 22;
        double salaryDouble = 2000.0D;
        float salaryFloat = (float) 2500.0D;
        char character = 'A';
        byte ageByte = -128;
        short ageShort = 32000;
        long bigNumber = (long) 155.23F;
        boolean trueBoolean = true;
        boolean falseBoolean = false;

        String name = "Melissa";
  
        System.out.println("My name is " +name+ " and I'm "+age+" years old.");
        //System.out.println("I'm " +age+ " years old.");
        System.out.println(trueBoolean);
        System.out.println(salaryFloat);
        System.out.println(bigNumber);
    }
}
