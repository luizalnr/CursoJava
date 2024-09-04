package exercicios;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();        
        
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] somaC = new int[n];
        
        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i<n; i++) {
        	vectA[i] = sc.nextInt();
        }
        
        
        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i<n; i++) {
        	vectB[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i < n; i++) {
            somaC[i] = vectA[i] + vectB[i];
        }
        
        
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", somaC[i]);
        }
        
        sc.close();
    }
}