package Fundamentos;

public class tiposPrimitivos {
    public static void main(String[] args) {
        //Informaçoes de um funcionario

        //Tipo numerico inteiro
        byte anosDeEmpresa = 23;//+-128
        short numeroDeVoos = 542;//+-32768
        int id = 56789;
        long pontosAcumulados = 3_234_567_890L;//associar o literal ao long com a letra L

        //Tipos numericos reais
        float salario = 11_445.44F;//letra F apresenta o literal em float
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = true;//true

        //Tipo caractere
        char status = 'a';//le somente um numero
        char statusUm = '\u0010';//Tabela unicode

        //Dias de empresa
        System.out.println(anosDeEmpresa*365);

        //Numero de viagens
        System.out.println(numeroDeVoos/2);

        //Pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id+"Ganha -> "+salario);
        System.out.println("Ferias?"+estaDeFerias);
        System.out.println("Status?"+status);

    }
}
