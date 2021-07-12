import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LargestFour {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner (System.in);
		
		int arr[] = new int[8];
		int numMaiores;				
		
		try {
			for(int i=0; i<arr.length; i++) {
				System.out.print("Digite um valor: ");
				arr[i] = input.nextInt();
			}
			System.out.print("\nLista: "+ Arrays.toString(arr));
			
			numMaiores  = LargestFour(arr);
			System.out.println("\nSoma dos Maiores: " + numMaiores);
			
		}catch (Exception erro) {
			System.out.println("\nCaracter Inválido\nErro: " + erro.toString());
		}
	}
	
	public static int LargestFour(int numeros[]) {
		int somaNMaiores = 0;			 
		int contMaiores = 1;			
		Arrays.sort(numeros);			
			
		for (int i = numeros.length -1; i >= 0; i--) {
			if (numeros.length <= 4) {
				somaNMaiores += numeros[i]; 
			} else {
				if (contMaiores <= 4) {					
					somaNMaiores += Math.max(numeros[i], numeros[i-1]);
					contMaiores++;
				}else {
					break;
				}
			}
		}
		return somaNMaiores;
	}
}
