package Strings;

public class Ej3 {

	public static String Eliminar(String arreglar) {
		
		int c=0;
		
		String arreglado="";
		for(int i=0;i<arreglar.length();i++) {
			
			if(arreglar.charAt(i)!=' ') {
				
				c=i;
			}
			
		}
		
		for(int j=0;j<arreglar.length();j++) {
			
			if(j<=c) {
				
				arreglado=arreglado+arreglar.charAt(j);
				
			}
			else {
				
				break;
				
			}
			
		}
		
		
		return arreglado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String puto="hola mundo cruel   ";
		System.out.println(Ej3.Eliminar(puto));
		
	}

}
