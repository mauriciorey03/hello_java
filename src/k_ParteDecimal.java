import java.util.Scanner;

public class k_ParteDecimal {
    public static void main(String[] args) {
        double decimal, conversion;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el número real: ");
        decimal = input.nextDouble();

        int entero = (int) decimal;

        conversion = decimal-entero;
        // System.out.println(conversion);
        System.out.printf("Mi texto Valor: %.2f", conversion);

        System.out.println(String.format("Otra alternativa %.2f", conversion));


        input.close();
    }
}

