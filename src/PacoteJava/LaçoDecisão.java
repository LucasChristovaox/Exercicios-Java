package PacoteJava;

import java.util.Scanner;

public class LaçoDecisão {
	
			public static void main(String[] args) {
			byte anos, meses, dias;
			int total;
			Scanner calc = new Scanner(System.in);
			System.out.print("Digite quantos anos você tem: ");
			anos=calc.nextByte();
			System.out.print("Digite quantos meses você tem: ");
			meses=calc.nextByte();
			System.out.print("Digite quantos dias você tem: ");
			dias=calc.nextByte();
			total=anos*365+meses*30+dias;
			System.out.printf("Você tem %d dias de nascido", total);

		}

	}

}
