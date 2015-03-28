import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Main programa = new Main();
		programa.Ejecucion();
	}
	
	public void Ejecucion() throws IOException{
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String t = new String(entrada.readLine());
		int casos = Integer.parseInt(t);
		int i;
		for (i= 1; i<=casos; i++){
			String t_datos = new String(entrada.readLine());
			String[] salarios = t_datos.split(" ");
			int k;
			int[] salarios_num = new int[3];
			for (k = 0; k<3; k++){
				salarios_num[k] = Integer.parseInt(salarios[k]);
			}
			Arrays.sort(salarios_num);
			System.out.println("Case "+i+": "+salarios_num[1]);
		}
	}

}
