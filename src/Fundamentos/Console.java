package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print("Dia\n");
        System.out.println("Bom");
        System.out.println("Dia!");

        System.out.printf("megasena: %d %d %d %d %d %d",1,2,3,4,5,6);
        System.out.printf("%nSalario: %.1f",1234.477);
        System.out.printf("%nnome: %s","João\n");

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("\nseu nome:"+nome+", "+"seu sobrenome:"+sobrenome);

    }
}
