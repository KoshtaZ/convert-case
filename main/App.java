package main;

import model.Text;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Text conversor = new Text();
        System.out.println("Informe o seu texto");
        String text = scan.nextLine();


        System.out.print("O que deseja fazer: ");
        int choose = scan.nextInt();
        switch (choose){

            case 1 : conversor = new Text(text);
                     System.out.println(conversor.toLowerCase(text));
                     break;
           case 2 :  conversor = new Text(conversor.toUpperCase(text));
                System.out.println(conversor.toUpperCase(text));
            default:
                System.out.println("Opção invalida!");
        }




    }
}
