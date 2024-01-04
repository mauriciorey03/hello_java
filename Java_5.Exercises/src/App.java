import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        
        Carro car1 = new Carro("Azul","JZD65G",2022,"Susuki",true);
        Carro car2 = new Carro("Negro","JZD65G",2023,"Susuki",true);
        Carro car3 = new Carro("Rojo", "ASD34G", 2024, "Victory", true);

        for(int i = 0; i<5; i++){
            car1.acelerar(random.nextInt(50)+1);
            car2.acelerar(random.nextInt(50)+1);
            car3.acelerar(random.nextInt(50)+1);
        }

        System.out.println("Car1 "+car1.velocidad);
        System.out.println("Car2 "+car2.velocidad);
        System.out.println("Car3 "+car3.velocidad);

        System.out.println("Color car1 "+car1.color);

        //static se puede colocar a atributos y métodos
        //
    }
}
