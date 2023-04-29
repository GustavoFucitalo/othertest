import java.util.Locale;
import java.util.Scanner;

public class soma_matrizes{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linha, coluna;
        //gustavo god or leticia trash
        System.out.println("Quantas linhas terá a matriz?");
        linha = sc.nextInt();
        System.out.println("Quantas colunas terá a matriz?");
        coluna = sc.nextInt();

        int[][] A = new int[linha][coluna];
        int[][] B = new int[linha][coluna];
        int[][] C = new int[linha][coluna];

        System.out.println("Digite os valores da matriz A:");

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.printf("Elemento [%d,%d]: ", i, j);
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.printf("Elemento [%d,%d]: ", i, j);
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("SOMA DAS MATRIZES: ");

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.printf("%d ", C[i][j]);
            }
            System.out.println();
        }
    }
}