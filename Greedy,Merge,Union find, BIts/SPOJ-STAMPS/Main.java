import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class Main {

	public static void main (String [] args) throws IOException{
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String t = entrada.readLine();
		int n = Integer.parseInt(t);
		for (int k = 0; k<n ; k++){
			
			String a = entrada.readLine();
			String[] datos = a.split(" ");
			int max = Integer.parseInt(datos[0]);
			int i = Integer.parseInt(datos[1]);
			a = entrada.readLine();
			datos = a.split(" ");
			int c = 0;
			int j = i-1;
			int[] arreglo = new int[i];
			for (int p = 0; p < i; p++){
				arreglo[p] = Integer.parseInt(datos[p]);
			}
			Arrays.sort(arreglo);
			//System.out.println(Arrays.toString(arreglo));
			while (c<max && j>=0){
				//System.out.println(arreglo[j]);
				c+= arreglo[j];
				if (c>=max){
					System.out.println("Scenario #"+(k+1)+":");
					System.out.println(i-j);
					System.out.println();
					break;
				}
				j--;
			}
			if (j<0){
				System.out.println("Scenario #"+(k+1)+":");
				System.out.println("impossible");
				System.out.println();
			}
			
		}
	}
	
}
