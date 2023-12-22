import java.util.Scanner;

public class c_quizz3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Promoción a aplica a: ");
        int n = input.nextInt();

        System.out.println("Ingrese la cantidad de productos: ");
        int cantidad = input.nextInt();

        int valor, Totalvalor = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Precio producto "+(i+1)+": ");
            valor =input.nextInt();
            Totalvalor += valor;
            
        } 
        System.out.println("Promoción aplicada a: "+n);
        System.out.println("Total: "+Totalvalor);

        input.close();
}
}