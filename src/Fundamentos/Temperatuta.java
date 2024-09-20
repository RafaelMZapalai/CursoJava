package Fundamentos;

public class Temperatuta {
    public static void main(String[] args) {
        double fahrenheit=86;
        double celsius = (fahrenheit -32)*5/9;
        System.out.println("a temperatura em celsius é = "+celsius+"C°");
        fahrenheit=100;
        celsius=(fahrenheit -32)*5/9;
        System.out.println("a temperatura em celsius é = "+celsius+"C°");
    }
}
