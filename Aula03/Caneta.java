package Aula03;

/**
 * Caneta
 */
public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void statuas(){
        System.out.println("\nCaneta da cor: " +  this.cor + " | Modelo: " + modelo + " | Ponta: " + ponta + " | Carga: " + carga +  " | Estado: " + tampada);
    }

    public void rabiscar(){
        if (tampada) {
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }

    public void tampar(){
        tampada = true;
    }

    public void destampar(){
        tampada = false;
    }
}
