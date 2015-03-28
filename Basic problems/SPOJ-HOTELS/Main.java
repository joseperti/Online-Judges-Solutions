import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

//HOTELS

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	static long[] numeros;
	
	static long ejecucion(long m, long N){
		long sup = 0;
		long inf = 0;
		long max = 0;
		long suma = numeros[(int) sup];
		while (sup<N){
			if (suma < m){
				if (suma > max){
					max = suma;
				}
				sup++;
				//System.out.println("Superior: "+sup);
				if (sup<N){
					suma += numeros[(int) sup];
				}
			}else if (suma == m){
				return suma;
			}else{
				if (inf < sup){
					suma -= numeros[(int) inf];
					inf++;
				}else{
					sup++;
					//System.out.println("Superior: "+sup);
					if (sup<=N){
						suma += numeros[(int) sup];
					}
				}
				
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String t = new String(entrada.readLine());
		String[] datos = t.split(" ");
		long N = Long.parseLong(datos[0]);
		long M = Long.parseLong(datos[1]);
		String t_nums = entrada.readLine();
		String[] numeros_str;
		numeros_str = t_nums.split(" ");
		//System.out.println("Longitud: "+(numeros_str.length - 1));
		numeros = new long[numeros_str.length];
		for (long i=0; i< (numeros_str.length-1);i++){
			//System.out.println(i);
			numeros[(int) i] = Long.parseLong(numeros_str[(int) i]);
		}
		System.out.println(ejecucion(M,N));
	}
	

}
