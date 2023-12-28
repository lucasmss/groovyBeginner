package adivinhaGame;

import java.util.Scanner;
import groovy.lang.Binding;
import groovy.lang.Script;
import org.codehaus.groovy.runtime.InvokerHelper;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class AdvinhaGame {

    int numeroMinimo = 0;
    int numeroMaximo = 100;
    int jogadas = 0;
    int tentativaJogador = 0;
    int jogarNovament = 0;
    boolean jogar = true;
    String nomeJogador = "";

    Scanner entrada = new Scanner(System.in);


    void jogar(){

        System.out.println("Bem vindo ao jogo Adivinha, qual seu nome? ");
        nomeJogador = entrada.nextLine();
        System.out.println("Vamos comerçar " + nomeJogador);


        while (jogar){

            int numeroSorte = (int) (Math.random() * (numeroMaximo - numeroMinimo) + 1);

        do {
            System.out.println("Foi gerado um número entre: " + numeroMinimo + " e: " + numeroMaximo + " adivinhe!");
            System.out.println("Digite um numero entre o maximo e o minimo");
            tentativaJogador = entrada.nextInt();

            if (tentativaJogador > numeroSorte) {
                System.out.println("Número digitado maior que o X");
            } else if (tentativaJogador < numeroSorte) {
                System.out.println("Número digitado menor que o X");
            }

            jogadas++;

        }while (tentativaJogador != numeroSorte);

            System.out.println("Acertou !!! O número " + numeroSorte + " Número de tentativas: " + jogadas);
            System.out.println("Jogar de novo ? sim (1) ou não(2) ");
            jogarNovament = entrada.nextInt();

            if (jogarNovament == 1) {
                jogar = true;
            }
            else{
                jogar = false;
            }

        }

    }
}