package sas;
import java.util.Scanner;
public class Java {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0,impar = 0,par = 0,multiplos = 0;
		
		while( n >= 0) {
			System.out.printf("diga um numero positivo ou um negativo para sair do programa");
			n = leia.nextInt();
			if(n%2 == 0 && n > 0){
				par ++; 
				
			}if(n%2 != 0 && n > 0){
				impar ++;
				
			}
			if(n%5 == 0 && n > 0) {
				multiplos ++;
				
			}
		}System.out.printf(" existem " + par +" numeros pares e existem " +impar+" numeros impares e existem " + multiplos + " numeors multiplos de 5 " );
		
		
		
		
		 }
	}	
	
		




