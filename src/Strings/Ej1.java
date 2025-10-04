package Strings;

public class Ej1 {
	
	
	public static void PrimerNumero (String lol) {
		
		char primer_numero=0;
		
		for(int i=0;i<lol.length();i++) {
			
			
			if(lol.charAt(i)>='0'&&lol.charAt(i)<='9') {
				primer_numero=lol.charAt(i);
				System.out.println("El primer número es: "+primer_numero);
				break;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pelele="Tengo 3 gatos y 2 perros";
		
		Ej1.PrimerNumero(pelele);
		
		
	}

}
