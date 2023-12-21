import java.util.Scanner;

public class j_HoraFutura {
    public static void main(String[] args) {
        int hora_actual, cantidad;

        Scanner input = new Scanner(System.in);

        System.out.println("Hora actual: ");
        hora_actual = input.nextInt();

        System.out.println("Cantidad de horas: ");
        cantidad = input.nextInt();


        
        if (hora_actual>24) {
            System.out.println("Error, hora mayor a 24.");
        } else if (hora_actual <= 24) {
            hora_actual += cantidad;

            // if (hora_actual >= 25) {
            //     System.out.println("En "+cantidad+" horas, el reloj marcara las "+hora_actual%12);
            // } else { 
            //     System.out.println("En "+cantidad+" horas, el reloj marcara las "+hora_actual%12 ); 
            // }

            System.out.println("En "+cantidad+" horas, el reloj marcara las "+hora_actual%12);
            
        }

        input.close();
    }
}
