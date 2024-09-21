import java.util.Scanner;
public class Beecrowd1009 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        String name;
        double salary,totalSales, total;
        
        //ler variáveis
        name = leitor.nextLine();
        salary = leitor.nextDouble();
        totalSales = leitor.nextDouble();
        
        total = salary + totalSales*0.15;
        
        //mostrar resultado no console
        System.out.printf("TOTAL = R$ %.2f%n" , total);
    }
}
