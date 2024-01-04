// import java.util.Scanner;

// public class a_quizz1 {
//     public static void main(String[] args) throws Exception {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Ingrese la cantidad de días: ");
//         int dia = input.nextInt();
//         input.close();

//         double alza =3.9;
//         for (int i = 0; i < dia; i++) {
//             System.out.print("Día "+(i+1)+": ");
//             double valor = input.nextDouble();            
//         }
//         System.out.println("La mayor alza fue "+alza);

//     } 
// }

import java.util.Scanner;

public class a_quizz1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el número de días: ");
        int numDia = leer.nextInt();
        double precioDolarHoy = 0;
        double precioDolarAyer = 0;
        double mayorAlza = 0;


        for (int i = 1; i <= numDia; i++) {
            System.out.print("Día "+(i)+", ingrese precio del dolar: ");
            precioDolarHoy = leer.nextDouble();
            mayorAlza = precioDolarHoy;
            double diferencia = Math.abs(precioDolarAyer - precioDolarHoy);
            if (mayorAlza<diferencia){
                mayorAlza = diferencia;
            }
            precioDolarAyer = precioDolarHoy;
        }
        System.out.println("La mayor alza fue "+mayorAlza);
        
        leer.close();
    } 
}