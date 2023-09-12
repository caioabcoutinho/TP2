package testeJava;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		int contadorVogais = 0, contadorDigitos = 0, contadorOutros = 0;
		char caracter;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantos caracteres você quiser. Quando quiser parar digite '.': ");
		
		do {
			
			caracter = teclado.next().charAt(0);
			
			if(caracter != '.') {
				if(caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E' || caracter == 'i' || caracter == 'I' || caracter == 'o' || caracter == 'O' || caracter == 'u' || caracter == 'U') {
					contadorVogais++;
				} else if (caracter == '0' || caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' || caracter == '6' || caracter == '7' || caracter == '8' || caracter == '9') {
					contadorDigitos++;
				} else {
					contadorOutros++;
				}
			}
		} while(caracter != '.');
		
		System.out.println("A quantidade de vogais é: " + contadorVogais + "\n" + "A quantidade de dígitos é: " + contadorDigitos + "\n" + "A quantidade dos demais caracteres é: " + contadorOutros);
		
		teclado.close();
	}
}
