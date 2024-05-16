package sas;
import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int matriz[][] = new int [2][3];
	int i , j =0 , soma=0;
	
	for(i = 0;i<2; i++) {
		for(j = 0;j<3;j++) {
			System.out.printf("escreva os numeros ");
			matriz[i][j] = leia.nextInt();
			
			
			}
		}
	for(i = 0;i<2;i++) {
		for(j = 0; j<3 ;j++) {
			soma += matriz[i][j];
			System.out.println( matriz[i][j]+ "%d");
		} 
		
	}

	}
}

