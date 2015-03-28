import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static long operacion(String num_1, String num_2,String op){
		//System.out.println("num_1: "+num_1+" num_2: "+num_2);
		if (op.equals("+")){
				return Long.parseLong(num_1)+Long.parseLong(num_2);
		}else if (op.equals("-")){
				return Long.parseLong(num_1)-Long.parseLong(num_2);
		}else if (op.equals("*")){
			return Long.parseLong(num_1)*Long.parseLong(num_2);
		}else if (op.equals("/")){
			return Long.parseLong(num_1)/Long.parseLong(num_2);
		}else{
			return 0;
		}
		
	}
	
	public static String transformador(long n){
		//System.out.println("Dato recibido: "+n);
		String dato = Long.toString(n);
		String nuevo = "";
		int cont = 0;
		char anterior = 'n';
		if (dato.length() ==1){
			nuevo = "1"+dato;
		}else{
			for (int k=0; k<dato.length(); k++){
				//System.out.println("Actual: "+dato.charAt(k)+" Anterior: "+anterior);
				if (k == 0){
					if (dato.charAt(k)=='-'){
						nuevo = nuevo + dato.charAt(k);
					}
					cont = 1;
					anterior = dato.charAt(k);
				}
				else if (dato.charAt(k)==anterior){
					//System.out.println("Iguales");
					if (cont+1>9){
						nuevo = nuevo + cont + anterior;
						cont = 1;
					}else{
						cont += 1;
					}
				}else{
					//System.out.println("Distintos: "+nuevo + cont + anterior);
					if (anterior == '-'){
						anterior = dato.charAt(k);
					}else{
						nuevo = nuevo + cont + anterior;
						cont = 1;
						anterior = dato.charAt(k);
					}
				}
			}
			nuevo = nuevo + cont + anterior;
		}		
		return nuevo;
		
	}
	
	public static String transformadorInverso(String n){
		int l = n.length();
		String dato = "";
		if (n == "0"){
			return "0";
		}else if(n == "00"){
			return "0";
		}
		for (int i=0;i<l;i = i+2){
			for (int k=0; k<Character.getNumericValue(n.charAt(i));k++){
				dato = dato + n.charAt(i+1);
			}
		}
		return dato;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		
		for (String t = entrada.readLine(); t!= null;t = entrada.readLine()){
			
			String[] datos = t.split(" ");
			System.out.println( datos[0]+" " + datos[1]+ " "+ datos[2] + " = " + 
					transformador(operacion(transformadorInverso(datos[0]),
							transformadorInverso(datos[2]),datos[1])));
			
		}
	}

}
