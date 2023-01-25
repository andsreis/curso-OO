package br.ufjf.dcc.exercicios;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		int n, n1, soma=0, n2;
		Scanner tec= new Scanner(System.in);
		System.out.println("Insira quantidade de numeros: ");
		n=tec.nextInt();
		n2=n;
		while(n!=0)
		{
			n1= tec.nextInt();
			if(n1==-1)
				break;
			else
				soma+=n1;;
			n--;
		}
		soma=soma/n2;
		System.out.println("Media: " + soma);
		
	}

}
