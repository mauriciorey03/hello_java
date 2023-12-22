import java.util.Scanner;

public class b_quizz2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuál producto escogera? (A,B,C,D)");
        String i = scanner.nextLine();
        int precio=0, saldo=0;
        String valor = i.toUpperCase();

        switch (valor) {
            case ("A"):
                precio = 270;
                System.out.println("Valor del producto $270");
                System.out.println("Ingrese monedas");
                while (saldo<precio){
                    saldo += scanner.nextInt();
                }
                System.out.println("Vueltos $"+(saldo-precio));
                break;
            case ("B"):
                precio =340;
                System.out.println("Valor del producto $340");
                System.out.println("Ingrese monedas");
                while (saldo<precio){
                    saldo += scanner.nextInt();
                }
                System.out.println("Vueltos "+(saldo-precio));
                break;
            case ("C"):
                precio =390;
                System.out.println("Valor del producto $390");
                System.out.println("Ingrese monedas");
                while (saldo<precio){
                    saldo += scanner.nextInt();
                }
                System.out.println("Vueltos "+(saldo-precio));
                break;
            default:
                System.out.println("No ingreso una letra valida");
        }
        scanner.close();
    }
}
