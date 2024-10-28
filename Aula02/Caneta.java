package Aula02;

/**
 * Caneta
 */
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void statuas(){
        System.out.println("\nCaneta da cor: " +  this.cor + " | Modelo: " + modelo + " | Ponta: " + ponta + " | Carga: " + carga +  " | Estado: " + tampada);
    }

    void rabiscar(){
        if (tampada) {
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }

    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;
    }
}
