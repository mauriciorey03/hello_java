import java.util.Scanner;

public class p_IMC {
    public static void main(String[] args) {
        double altura, peso, edad, imc;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la altura ");
        altura = input.nextDouble();

        System.out.println("Ingrese el peso ");
        peso = input.nextDouble();

        System.out.println("Ingrese la edad ");
        edad = input.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Su IMC es de " + imc);

        if (edad < 18) {
            if (imc < 19) {
                System.out.println("Su riesgo es bajo.");
            } else if (imc > 24) {
                System.out.println("Su riesgo es alto.");
            } else {
                System.out.println("Su riesgo es medio.");
            }
        } else if (edad < 45) {
            if (imc < 22) {
                System.out.println("Su riesgo es bajo.");
            } else {
                System.out.println("Su riesgo es medio.");
            }
        } else {
            if (imc < 22) {
                System.out.println("Su riesgo es medio.");
            } else {
                System.out.println("Su riesgo es alto.");
            }
        }
        input.close();
    }
}
