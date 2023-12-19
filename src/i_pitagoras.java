import java.util.Scanner;

public class i_pitagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Define el input
        double a, b, c; // declara el type de los parametros

        System.out.println("Ingrese el cateto a: ");
        a = input.nextDouble();
        //pide el valor de a

        System.out.println("Ingrese el cateto b: ");
        b = input.nextDouble();
        //pide el valor de b


        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        //hace la raíz de a^2+b^2

        System.out.println("En fin, la hipotenusa es: " + c);

        input.close();
        //cierra el resultado
    }
}