import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {


	String[] A = {"m","a","n","k","u"};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Main programa = new Main();
		programa.Ejecucion();
	}
	
	public void cb(BigInteger n){
		//System.out.println(n.toString());
		if (n.compareTo(new BigInteger("0") )== 0){
			System.out.println("");
		}else if (n.subtract(new BigInteger("1")).compareTo(new BigInteger("4")) == -1 || n.subtract(new BigInteger("1")).compareTo(new BigInteger("4")) == 0){
			System.out.print(A[(n.intValue()-1)]);
		}else{
			cb(n.subtract(new BigInteger("1")).divide(new BigInteger("5")));
			System.out.print(A[n.subtract(new BigInteger("1")).mod(new BigInteger("5")).intValue()]);
		}
	}
	
	public void Ejecucion() throws IOException{
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String t = entrada.readLine();
		long n = Long.parseLong(t);
		
		for (long k = 0; k<n; k++){
			String palabra = "";
			String a = entrada.readLine();
			if (!a.equals("")){
				BigInteger num = new BigInteger(a);
				cb(num);
			}
			
			System.out.println();
		}
	}
}
