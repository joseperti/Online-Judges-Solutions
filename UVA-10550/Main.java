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
		String t = new String(entrada.readLine());
		while (!t.equals("0 0 0 0")){
			String[] datos = t.split(" ");
			int pos = Integer.parseInt(datos[0]);
			int A = Integer.parseInt(datos[1]);
			int B = Integer.parseInt(datos[2]);
			int C = Integer.parseInt(datos[3]);
			System.out.println(360+360+360 + giroclock(pos,A) + 360 - giroclock(A,B) + giroclock(B,C));
			t = new String(entrada.readLine());
		}
	}
	
	public int giroclock(int num_1,int num_2){
		if (num_1>=num_2){
			return (num_1 - num_2)*9;
		}else{
			return (num_1 + 40 - num_2)*9;
		}
	}

}
