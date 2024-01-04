public class Carro {
    public String color;
    public String placa;
    public int modelo;
    public String marca;
    public boolean motorEstado;
    public int velocidad;

    public Carro(){
    }

    public Carro(String color, String placa, int modelo, String marca, boolean motorEstado){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.motorEstado=motorEstado;
        this.placa=placa;
        this.velocidad=0;
    }

    public void mostrar(){
        System.out.println("Color: "+this.color);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Motor estado: "+this.motorEstado);
        System.out.println("Placa: "+this.placa);
    }

    public void acelerar(int valor){
        this.velocidad+=valor;
    }
    public void frenar(int valor){
        this.velocidad-=valor;
    }
}
