package main;

import model.Case;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Case converter = new Case();

        System.out.println("Informe o seu texto: ");
        String string = scan.nextLine();

        System.out.println("O que deseja fazer, escolha uma das opcoes abaixo: ");
        System.out.println("1: Minuscula");
        System.out.println("2: Maiscula");
        System.out.println("3: Camel case");
        System.out.println("4: Titulo Case");
        System.out.println("5: AlTeRnAdO");
        int choose = scan.nextInt();

        switch (choose){
            case 1:
                System.out.println(converter.toLowerCase(string));
                break;
            case 2:
                System.out.println(converter.toUpperCase(string));
                break;
            case 3:
                System.out.println(converter.CamelCase(string));

            default:
                System.out.println("Opção inválida");
        }




    }
}
