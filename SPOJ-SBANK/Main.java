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
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String in = entrada.readLine();
		long T = Long.parseLong(in);
		for (long k=0;k<T;k++){
			in = entrada.readLine();
			long num_c = Long.parseLong(in);
			String[] cuentas_str = new String[(int) num_c];
			for (long i=0; i<num_c; i++){
				cuentas_str[(int) i] = entrada.readLine();
			}
			Arrays.sort(cuentas_str);
			long cont = 1;
			String anterior = "";
			for (String valor:cuentas_str){
				//System.out.println("Anterior: "+anterior);
				//System.out.println("Nuevo: "+valor);
				if (valor.equals(anterior)){
					cont += 1;
				}else{
					if (!anterior.equals("")){
						System.out.println(anterior+" "+cont);
					}
					cont = 1;
					anterior = valor;
				}
			}
			System.out.println(anterior+" "+cont);
			in = entrada.readLine();
			if (k<(T-1)){
				System.out.println();
			}
		}
		
	}

}
