import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Main programa = new Main();
		programa.Ejecucion();
	}
	
	public void Ejecucion() throws IOException{
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String t = entrada.readLine();
		while ((!t.equals("0")) && (t.charAt(0) != '0')){
			String[] datos = t.split(" ");
			int N = Integer.parseInt(datos[0]);
			int nivel = 0;
			int sumatorio = 0;
			while ((sumatorio) < N){
				//System.out.println((int) Math.pow(2,nivel));
				sumatorio += (int) Math.pow(2,nivel);
				nivel++;
				
				//System.out.println("Potencia: "+sumatorio+" < N: "+N);
			}
			nivel--;
			sumatorio -= (int) Math.pow(2,nivel);
			
			//System.out.println("nivel: "+nivel+" menos 1 N:"+N+ " Sumatorio: "+sumatorio);
			int suma = 0;
			//System.out.println("Hojas abajo del todo: "+(N-sumatorio));
			//System.out.println("Redondeo del superior: " +Math.ceil(((double) N-sumatorio)/2));
			for (int k = sumatorio+1;k <=N; k++){
				//System.out.println(datos[k] + " posicion k: "+k);
				suma += Integer.parseInt(datos[k]);
			}
			int nuevo_sumatorio = sumatorio - (int) Math.pow(2,nivel-1);
			for (int k = (int) (1+nuevo_sumatorio + Math.ceil(((double) N-sumatorio)/2)); k <= sumatorio; k++){
				//System.out.println("Posicion: "+ k+ " dato: "+ datos[k]);
				suma += Integer.parseInt(datos[k]);
			}
			System.out.println(suma);
			t = entrada.readLine();
		}
	}

}
