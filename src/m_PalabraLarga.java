import java.util.Scanner;

public class m_PalabraLarga {
    public static void main(String args[]){
    String palabra1, palabra2;
    int cantidad1, cantidad2, diferencia;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese la palabra 1");
    palabra1=input.next();
    cantidad1=palabra1.length();
    
    System.out.println("Ingrese la palabra 2");
    palabra2=input.next();
    cantidad2=palabra2.length();

    if (cantidad1 > cantidad2) {
        diferencia = cantidad1-cantidad2;
        System.out.println("La palabra "+palabra1+" tiene "+diferencia+" letras más que "+palabra2+".");
    } else if (cantidad1 < cantidad2) {
        diferencia = cantidad2-cantidad1;
        System.out.println("La palabra "+palabra2+" tiene "+diferencia+" letras más que "+palabra1+".");
    } else {
        System.out.println("Las dos palabras tienen el mismo largo.");
    }

    input.close();
}
}