package Fundamentos;

public class tipoString {
    public static void main(String[] args) {
        String s = "Boa tarde";
        System.out.println(s.concat("???"));
        System.out.println(s + "!!!");
        System.out.println("Boa noite".charAt(3)+s.toUpperCase());// procurar caracter
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("Boa tarde"));
        var nome = "Pedro";
        var sobrenome = "Rafael";
        var idade = 20;
        var salario = 1234.56;
        System.out.println("Nome:"+nome+" "+"\nSobrenome:"+sobrenome+"\nidade:"+idade+"\nSalario:"+salario);
        System.out.printf("nome: %s \nsobrenome: %s \nidade: %d \nsalario; %.2f",nome,sobrenome,idade,salario);
        String frase = String.format("\nnome: %s \nsobrenome: %s \nidade: %d \nsalario; %.2f",nome,sobrenome,idade,salario);
        System.out.println(frase);
        System.out.println("frase qualquer".contains("qualquer"));
        System.out.println("frase qualquer".indexOf("qualquer)"));
        System.out.println("frase qualquer".substring(6,10));
    }
}
