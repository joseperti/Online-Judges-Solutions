import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Main programa = new Main();
		programa.Ejecucion();
	}
	
	public void Ejecucion() throws IOException{
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String t;
		String[] n = {"``","''"};
		int m = 0;
		while ((t = entrada.readLine()) != null){
			while (t.indexOf("\"")!=-1){
				t = t.replaceFirst("\"", n[m]);
				m = (m+1)%2;
				//System.out.println(t);
				//System.out.println("m: "+m+" char: "+n[m]);
			}
			System.out.println(t);
		}
		
	}

}
