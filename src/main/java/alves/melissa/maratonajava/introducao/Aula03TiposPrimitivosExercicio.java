package alves.melissa.maratonajava.introducao;

/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <name>, morando no endereço <address>,
confirmo que recebi o salário de <salary>, na data <date>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String name = "Melissa Alves";
        String address = "Av. Senador Helvídio Nunes";
        double salary = 1518.55;
        String payDate = "24/07/2025";

        String relatorio = "Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de R$"+salary+", na data " +payDate+".";
        System.out.println(relatorio);

        System.out.println("Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de R$"+salary+", na data "+payDate+".");
    }
}
