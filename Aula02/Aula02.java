package Aula02;

/**
 * Aula02
 */
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.modelo = "BIC Cristal";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampada = true;

        c1.destampar();

        c1.statuas();

        c1.rabiscar();

        c1.tampar();

        c1.rabiscar();

    }
}