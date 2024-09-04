package exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int position = 0;
        
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];
        
        // Digitando os números
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        
        // Inicializando maiorNumero com o primeiro elemento do vetor
        double maiorNumero = vect[0];
        position = 0;
        
        // Checando qual número é o maior
        for (int i = 1; i < vect.length; i++) {
            if (vect[i] > maiorNumero) {
                maiorNumero = vect[i];
                position = i;
            }
        }
        
        // Imprimindo o maior valor
        System.out.printf("MAIOR VALOR = %.1f\n", maiorNumero);
        // Imprimindo a posição do maior valor (considerando 1-indexed)
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", position + 1);
        
        sc.close();
    }
}
