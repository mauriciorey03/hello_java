public class c_Circulo {
    public static void main(String arg[]) {
        int radio=Integer.parseInt(arg[0]);
        double perimetro = 2 * Math.PI*radio;
        double area = Math.pow(radio,2);
        System.out.println("Perimetro: " + perimetro + " area: " + area);
    }
}
