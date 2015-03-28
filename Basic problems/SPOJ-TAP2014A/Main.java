import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		String dato = entrada.readLine();
		int t_a = Integer.parseInt(dato);
		for (int i=0; i<t_a; i++){
			
			String dato_b = entrada.readLine();
			int t_b = Integer.parseInt(dato_b);
			String[] anterior = {"",""};
			boolean orden = false;
			for (int j = 0; j<t_b ; j++){
				
				String dato_c = entrada.readLine();
				String[] cadena = dato_c.split(" ");
				//System.out.println("Anterior: "+Arrays.toString(anterior)+" Actual: "+Arrays.toString(cadena));
				if ((anterior[0].equals(cadena[0])) || (anterior[1].equals(cadena[1]))){
					//System.out.println('M');
					orden = true;
				}else{
					anterior = cadena;
				}
				
			}
			if (!orden){
				System.out.println('B');
			}else{
				System.out.println('M');
			}
			
		}
		
	}

}
