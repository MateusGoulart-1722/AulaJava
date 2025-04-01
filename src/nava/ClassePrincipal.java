package nava;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Imprimir mensagem
		
		System.out.println("Hello, world!"); // sysout & CTRL + SPACE
		
		// Imprimir mensagem sem pular linha
		System.out.printf("Olá, mundo!");
		
		// Valores inteiros pequeno
		byte idadePessoa = 18;
		byte valorMaximoBytePos = 127;
		byte valorMaximoByteNeg = -128;
		
		// Valor inteiro médio
		short anoNascimentoPessoa1 = 2007;
		short anoNascimentoPessoa2 = 2_007;
		short valorMaximoShortPos = 32_767;
		short valorMaximoShortNeg = -32_768;
		
		// Valor inteiro grande
		int populacaoAssis1 = 106000;
		int populacaoAssis2 = 106_000;
		int valorMaximoIntPos = 2_147_483_647;
		int valorMaximoIntNeg = -2_147_483_648;
		
		// Valor inteiro muito grande
		long populacaoTerra1 = 8000000000L; // 9 zeros // Obrigatório L
		long populacaoTerra2 = 8_000_000_000L;
		long valorMaximoLongPos = 9_223_372_036_854_775_807L; // 9 Quintilhões
		long valorMaximoLongNeg = -9_223_372_036_854_775_808L; // 9 Quintilhões

		// Valor inteiro muito grande, muito grande
		//BitInteger valorMuitoMuitoGrande = new BitInteger("999");
		
		// Casting = Forçar variável a ser 1 tipo de dado
		idadePessoa = (byte) (idadePessoa + 1); // idadePessoa + 1 == Inteiro
		
		Scanner batata_var = new Scanner(System.in);
		System.out.println("Informe sua idade");
		int idadeAluno = batata_var.nextInt();
		System.out.println("Sua idade é " + idadeAluno + " anos");
	}

}
