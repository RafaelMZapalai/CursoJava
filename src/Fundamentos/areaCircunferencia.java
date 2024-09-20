package Fundamentos;

public class areaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159; //constante
        double area = PI*raio*raio;
        System.out.println("Area = "+area + "m2");
        raio = 10;
        area = PI*raio*raio;
        System.out.println("Area = "+area + "m2");
    }
}
