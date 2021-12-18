package PacoteJava;

import java.util.Scanner;

public class vetoresObjetos {
	public static void main(String[] args) {
		float [][] matriz = new float[3][4];
		float [] m = new float[3];
		int aluno,nota;
		Scanner valor = new Scanner(System.in);
		for(aluno=0;aluno<3;aluno++) 
		{
			float soma=0;
			System.out.printf("Digite as notas do %dº aluno: \n", aluno+1);
			for(nota=0;nota<4;nota++)
			{
				System.out.printf("Digite a %dª nota: ",nota+1);
				matriz[aluno][nota]=valor.nextFloat();
				soma=soma+matriz[aluno][nota];
			}
			m[aluno]=soma/4;
		}
		System.out.println("As médias dos alunos foram: ");
		for(aluno=0;aluno<3;aluno++)
		{	
			System.out.print(m[aluno]+"\t");
		}
	}


}
