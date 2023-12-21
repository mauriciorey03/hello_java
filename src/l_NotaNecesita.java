import java.util.Scanner;

public class l_NotaNecesita {
    public static void main(String[] args) {
        double nota1, nota2, nota3, lab, notac;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nota certamen 1: ");
        nota1 = input.nextInt();
        System.out.println("Ingrese nota certamen 2: ");
        nota2 = input.nextInt();
        System.out.println("Ingrese nota lab: ");
        lab = input.nextInt();

        notac = (60 - lab * 0.3)/0.7;

        nota3 = (int) (3* notac - nota1 - nota2);
        int valor = (int)Math.floor(nota3);
        
        System.out.println("Necesita " + valor + " en el certamen 3");

        input.close();
    }
}
