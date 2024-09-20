package Fundamentos;
//var é uma inferencia, ou seja o Java descobre qual é o tipo da variavel, porem depois de declara tambem
//nao pode mais ser alterado o tipo.
public class Interferencia {
    public static void main(String[] args) {
        double a = 4.5;//exemplo double
        System.out.println(a);
        var b = 4.5;//double
        System.out.println(b);
        var c = "Texto";//String
        System.out.println(c);
        c = "Outro Texto";//String
        System.out.println(c);
        var d = 10;//inteiro
        System.out.println(d);
    }
}
