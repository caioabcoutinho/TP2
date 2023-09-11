package testeJava;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		double x, valorDecimal, aux2;
		int aux;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número real: ");
		x = teclado.nextDouble();
		
		aux = (int)x;
		valorDecimal = x - aux;
		aux2 = 1 - valorDecimal;
		
		if(valorDecimal < 0.5) {
			x = aux;
		}else {
			x += aux2;
		}
		
		 System.out.println("Valor arredondado: " + x);
	}

}
