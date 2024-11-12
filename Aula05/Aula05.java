package Aula05;

import java.util.Scanner;

/**
 * Aula05
 */
public class Aula05 {
    static Scanner scanner = new Scanner(System.in);
    static ContaBanco banco = new ContaBanco(0, null, null, 0, false);
    public static void main(String[] args) {
        abrirConta();
        banco.pagarMensal(10);
        System.out.println(banco);
    }
    public static void abrirConta(){
        System.out.print("\nDigite seu nome: ");
        String nome = scanner.nextLine();
        banco.setDono(nome);
        System.out.print("\nDigite (cc) para conta corrente ou (cp) para conta poupança: ");
        String tipoConta = scanner.nextLine();
        banco.setTipo(tipoConta);
        banco.abrirConta(tipoConta);
        System.out.println(banco); 
    }
}