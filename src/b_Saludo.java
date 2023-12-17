import java.util.Scanner;

public class b_Saludo {
    public static void main(String[] args) throws Exception {
        Scanner Leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = Leer.next();
        System.out.println("Hola, ¿cómo está "+ nombre + "?");
        Leer.close();
    }
}
