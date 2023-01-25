package br.ufjf.dcc.exercicios;

import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
		int i, f, j;
		Scanner tec= new Scanner(System.in);
		System.out.println("Insira inicio do intervalor: ");
		i=tec.nextInt();
		System.out.println("Insira fim do intervalor: ");
		f=tec.nextInt();
		if(f<i) {
			System.out.println("Insira fim do intervalor (deve ser menor que o inicio): ");
			f=tec.nextInt();
		}
		for(j=i;j<=f;j++)
		{
			System.out.print(i+" ");
			i++;
		}

	}

}
