package Fundamentos;

public class primitivovsObjeto {
    public static void main(String[] args){
        String s = new String("texto");
        s.toUpperCase();

        //wrappers sao a versao objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);
    }
}
