import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada =
			new BufferedReader(new InputStreamReader(System.in));
		String line = entrada.readLine();
		while ( !line.equals(null)) {
			if (line.equals("")){
				System.out.println("Error!");
				line = entrada.readLine();
			}else{
				String[] datos = line.split(" ");
				if (datos.length != 1){
					System.out.println("Error!");
					line = entrada.readLine();
				}
				datos = line.split("_");
				//System.out.println("Longitud "+datos.length);
				if (datos.length == 1){
					//System.out.println("Esta en java");
					
					char[] dato = datos[0].toCharArray();
					int var = datos[0].charAt(0);
					if (var>=65 && var <= 90){
						System.out.println("Error!");
						//break;
					}else{
						for ( char valor : dato){
							//System.out.println("Valor: "+valor + " int: "+Character.getNumericValue(valor));
							if ((int) valor>=65 && (int) valor<=90){
								System.out.print("_"+Character.toLowerCase(valor));
							}else{
								System.out.print(valor);
							}
						}
						System.out.println();
					}
					
					
				}else{
					//System.out.println("Esta en C");
					int k;
					String salida = "";
					boolean error = false;
					for (k = 0; k<datos.length;k++){
						if (!datos[k].equals("")){
							int var = datos[k].charAt(0);
							if (var>=65 && var <= 90){
								error = true;
								break;
							}
							if (k==0){
								salida += datos[k];
							}else{
								String compl = datos[k].substring(1,datos[k].length());
								salida += Character.toUpperCase(datos[k].charAt(0))+compl;
							}
						}
					}
					if (error){
						System.out.println("Error!");
						//break;
					}else{
						System.out.println(salida);
					}
				}
				line = entrada.readLine();
			}
		}
	}

}
