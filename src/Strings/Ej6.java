package Strings;

public class Ej6 {

	public static String reemplazo (String s) {
		
		String devolver="";
		char[] lol=s.toCharArray();
		
		for(int i=0; i<s.length();i++) {
			
			if(s.charAt(i)=='.') {
				
				lol[i]=',';
				
			}
			
		}
		
		for(int j=0;j<lol.length;j++) {
			
			devolver=devolver+lol[j];
		}
		
		return devolver;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prueba="hola. me llamo Pepe";
		
		
		System.out.println(Ej6.reemplazo(prueba));
	}

}
