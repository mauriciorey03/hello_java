import java.util.Scanner;
import java.time.LocalDateTime;

public class n_Edad {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now(); // LocalDateTime es el import que permite obtener la fecha
        // con el método .get obtengo datos exactos
        int 
        dd = fecha.getDayOfMonth(), 
        mm = fecha.getMonthValue(), 
        yyyy = fecha.getYear();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día ");
        int day = scanner.nextInt();

        System.out.println("Ingrese el mes ");
        int month = scanner.nextInt();

        System.out.println("Ingrese el año ");
        int year = scanner.nextInt();

        int today_year =yyyy- year;

        if (mm <= month) {
            if (dd >= day) {
            today_year-=1;
        }
        }

        System.out.println("Usted tiene "+today_year+" años.");
        scanner.close();
    }
}

// import java.util.Scanner;
// import java.time.LocalDateTime;

// public class n_PendEdad {
//     public static void main(String[] args) {
//         LocalDateTime fecha = LocalDateTime.now(); 
//         int dd = fecha.getDayOfMonth(), mm = fecha.getMonthValue(), yyyy = fecha.getYear();
//         System.out.println(fecha);

//         System.out.println("Dia " + fecha.getDayOfMonth() +
//         ", mes " + fecha.getMonthValue()+ 
//         ", año " + fecha.getYear()
//         );
//     }
// }

// int dia, mes, year;
// Scanner input = new Scanner(System.in);

// ⚙ **Edad**

// Escriba un programa que entregue la edad del usuario a partir de su fecha de
// nacimiento:

// `Ingrese su fecha de nacimiento.
// Dia: **14**
// Mes: **6**
// Anno: **1948**
// Usted tiene 62 annos`

// Por supuesto, el resultado entregado depende del día en que su programa será
// ejecutado.

// El programa debe tener en cuenta si el cumpleaños ingresado ya pasó durante
// este año, o si todavía no ocurre.
