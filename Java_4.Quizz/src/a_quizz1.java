import java.util.Scanner;

public class a_quizz1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de días: ");
        int dia = input.nextInt();
        input.close();

        double alza =3.9;
        for (int i = 0; i < dia; i++) {
            System.out.print("Día "+(i+1)+": ");
            double valor = input.nextDouble();            
        }
        System.out.println("La mayor alza fue "+alza);

    } 
}