package Fundamentos;

public class notaçaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.toUpperCase();//deixa maiusculo
        s = s.replace("X","Senhor ");//substitui string
        s = s.concat("Rafael").toUpperCase();//coloca palavra depois.//deixa maisculo
        System.out.println(s);
    }
}
