import java.text.DecimalFormat;

public class g_CmToInch {
    public static void main(String[] args){
        int valor1 = 45, valor2= 13;
        double inc = 2.54, valor1_final, valor2_final;
        
        DecimalFormat dFormat = new DecimalFormat("#.00000");

        valor1_final = valor1/inc;
        valor2_final = valor2/inc;
        System.out.println(valor1+" cm en pulgadas es igual a " +dFormat.format(valor1_final) +" inc");
        System.out.println(valor2+" cm en pulgadas es igual a " +dFormat.format(valor2_final) +" inc");
        }
    }