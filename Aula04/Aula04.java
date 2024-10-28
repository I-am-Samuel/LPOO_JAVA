package Aula04;

import java.util.Scanner;

/**
 * Aula04
 */
public class Aula04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caneta c1 = new Caneta(null, 0);

        System.out.print("Digite o nome do modelo: ");
        String modelo = scanner.nextLine();

        c1.setModelo(modelo);
        //c1.modelo = "BIC";
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        c1.status();

        c1.destampar();

        c1.rabiscar();

        scanner.close();

    }
}