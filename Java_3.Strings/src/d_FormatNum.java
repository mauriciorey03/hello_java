public class d_FormatNum {
    public static void main(String[] args) {
        String mensaje = "";

        float valor = 10.87204f;
        mensaje = String.format("%.2f", valor);
        System.out.println(mensaje);

        // EJEMPLO CON TEXTO

        String precio = "COP";
        // %d valor entero, %.2f # decimalex, %s string
        mensaje = String.format("El total de %d, articulos es de %.2f en %s", 3, valor, precio);
        System.out.println(mensaje);

        float pi = 3.14159265359f;

        String resultadopi = String.format("%1f - Decimales: %1$.2f", pi, pi);
        System.out.println(resultadopi);

        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";

        String resultado = String.format("%3$s - %2$s - %1$s",
                uno, dos, tres);
        System.out.println(resultado);
    }
}