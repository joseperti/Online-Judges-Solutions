import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Main {

	/**
	 * @param args
	 */
	public static void main (String [] args) throws IOException{
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String t = entrada.readLine();
		int n = Integer.parseInt(t);
		for (int k = 0; k<n ; k++){
			String a = entrada.readLine();
			int m = Integer.parseInt(a);
			a = entrada.readLine();
			String[] datos_1 = a.split(" ");
			int[] hombres = new int[m];
			a = entrada.readLine();
			String[] datos_2 = a.split(" ");
			int[] mujeres = new int[m];
			for (int i = 0; i<m; i++){
				hombres[i] = Integer.parseInt(datos_1[i]);
				mujeres[i] = Integer.parseInt(datos_2[i]);
			}
			Arrays.sort(hombres);
			Arrays.sort(mujeres);
			int c = 0;
			for (int i = m-1; i>=0; i--){
				c += hombres[i]*mujeres[i];
			}
			System.out.println(c);
		}
	}

}
