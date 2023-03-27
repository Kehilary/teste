/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.cefetmg.inf.main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner variavel = new Scanner(System.in);
        int M = variavel.nextInt();
        int N = variavel.nextInt();
        int[][] matriz = new int[M][N];

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                matriz[x][y] = variavel.nextInt();
            }
        }

        for (int A = 1; A < 12; A++) {
            for (int B = 1; B < 12; B++) {
                if (matriz[A][B] == 42) {
                    if (matriz[A - 1][B - 1] == 7 && matriz[A + 1][B + 1] == 7 && matriz[A - 1][B + 1] == 7 && matriz[A + 1][B - 1] == 7 && matriz[A][B - 1] == 7 && matriz[A][B + 1] == 7 && matriz[A + 1][B] == 7 && matriz[A - 1][B] == 7) {
                        System.out.printf("%d %d\n", A, B);
                    }
                }
            }
        }

        System.out.printf("0 0\n");

    }

}
