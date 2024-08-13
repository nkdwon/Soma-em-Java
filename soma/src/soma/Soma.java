package soma;

import java.util.*;

class Soma {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, soma;
		
		System.out.println("Soma de 2 números!!");
		
		System.out.println("Insira o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma dos 2 números é de: " + soma);
	}

}
