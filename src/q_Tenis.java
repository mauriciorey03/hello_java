import java.util.Scanner;

public class q_Tenis {
    public static void main(String[] args) {
        String mensaje;
        int juegos_a, juegos_b;

        Scanner input = new Scanner(System.in);

        System.out.println("Juegos ganados por A ");
        juegos_a = input.nextInt();

        System.out.println("Juegos ganados por B ");
        juegos_b = input.nextInt();
        
        if (juegos_a < 6 && juegos_b <6) {
            mensaje = "aún no termina";
            System.out.println(mensaje);
        } else if ((juegos_a > 6 && juegos_b < 5) || (juegos_b > 6 && juegos_a < 5)) {
            mensaje = "Inválido";
            System.out.println(mensaje);
        } else{
            mensaje = "es igual o mayor a 6";
            System.out.println(mensaje);
            if (juegos_a > juegos_b) {
                mensaje = "Ganó A";
                System.out.println(mensaje);
            } else if (juegos_a < juegos_b) {
                mensaje = "Ganó B";
                System.out.println(mensaje);
            }
        } 
        input.close();
}
}
