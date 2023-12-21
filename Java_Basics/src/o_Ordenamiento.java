import java.util.Scanner;
// Escriba un programa que reciba como entrada dos números, y los muestre ordenados de menor a mayor:

// `Ingrese numero: **51**
// Ingrese numero: **24**
// 24 51`


// public class o_Ordenamiento  {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Ingrese numero: ");
//         int num1 = input.nextInt();

//         System.out.print("Ingrese numero: ");
//         int num2 = input.nextInt();

//         if (num1 < num2) {
//             System.out.println(num1 + " " + num2);
//         } else {
//             System.out.println(num2 + " " + num1);
//         }
//         input.close();
//     }
// }

// A continuación, escriba otro programa que haga lo mismo con tres números:

// `Ingrese numero: **8**
// Ingrese numero: **1**
// Ingrese numero: **4**
// 1 4 8`

// Finalmente, escriba un tercer programa que ordene cuatro números:

// `Ingrese numero: **7**
// Ingrese numero: **0**
// Ingrese numero: **6**
// Ingrese numero: **1**
// 0 1 6 7`

public class o_Ordenamiento  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese numero 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese numero 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Ingrese numero 4: ");
        int num4 = scanner.nextInt();

        // Ordenar num1 y num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Ordenar num3 y num4
        if (num3 > num4) {
            int temp = num3;
            num3 = num4;
            num4 = temp;
        }

        // Ordenar num1 y num3 (comparando el menor de los dos primeros con el menor de los dos últimos)
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // Ordenar num2 y num4 (comparando el mayor de los dos primeros con el mayor de los dos últimos)
        if (num2 > num4) {
            int temp = num2;
            num2 = num4;
            num4 = temp;
        }

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

        scanner.close();
    }
}

// Recuerde que su programa debe entregar la solución correcta para cualquier combinación de números, no sólo para los ejemplos mostrados aquí.

// Hay más de una manera de resolver cada ejercicio.