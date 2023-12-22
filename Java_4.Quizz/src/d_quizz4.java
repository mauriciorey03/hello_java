import java.util.Scanner;

public class d_quizz4 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, prome;
        boolean seguir = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nota certamen 1: ");
        nota1 = input.nextDouble();
        System.out.println("Ingrese nota certamen 2: ");
        nota2 = input.nextDouble();

        if (nota1 < 2 && nota2 < 2) {
            System.out.println("Reprobado, no puede hacer el tercer examen.");
            seguir = false;
        } else if (nota1 > 9 && nota2 > 9) {
            System.out.println("Aprobado, está eximido de hacer el tercer examen.");
            seguir = false;
        } else if (seguir) {
            System.out.println("Ingrese nota certamen 3: ");
            nota3 = input.nextDouble();
            prome = (nota1 + nota2 + nota3)/3;
            System.out.println("Promedio: "+prome);

            if (prome < 3) {
                System.out.println("Reprobado");
            } else if (prome >= 7) {
                System.out.println("Aprobado");
            } else if (prome >= 3) {
                System.out.println("Ingrese nota examen: ");
                double exam = input.nextDouble();
                if (exam > 5) {
                    System.out.println("Aprobado, pasó.");
                } else if (exam < 5) {
                    System.out.println("Reprobado, no pasó.");
                }
        }

        }

        input.close();
    }
}