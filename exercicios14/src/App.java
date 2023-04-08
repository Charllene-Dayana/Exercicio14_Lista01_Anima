import java.util.Scanner;

public class App {
    // João Papo-de-Pescador, homem de bem, comprou um microcomputador
    // para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um
    // peso de peixes maior que o estabelecido pelo regulamento de pesca do estado
    // de São Paulo
    // (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa
    // que você
    // faça um programa que leia a variável peso (peso de peixes) e calcule o
    // excesso. Gravar na
    // variável excesso a quantidade de quilos além do limite e na variável multa o
    // valor da multa
    // que João deverá pagar. Imprima os dados do programa com as mensagens
    // adequadas.

    public static void main(String[] args) throws Exception {
        double pesopeixe;
        double excesso;
        double multa;
        Scanner teclado = new Scanner(System.in);
        System.out.println("quantos quilos joão trouxe");
        pesopeixe = teclado.nextDouble();
        excesso = pesopeixe - 50;
        multa = (4.00 * excesso);
        System.out.println("o peso excedido foi " + excesso);
        System.out.println("valor da multa em reais que joão devera paga é " + multa);
        teclado.close();

    }
}
