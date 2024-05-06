/* Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        int numero, resultado = 1;
        System.out.println("Digite o número que se quer calcular o fatorial: ");
        numero = leitura.nextInt();
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        System.out.printf("%d! = %d", numero, resultado);
    }
}