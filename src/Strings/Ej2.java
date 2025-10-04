package Strings;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hola Don Pepito";
		
		int c=0;
		
		for(int i=0; i<s.length();i++) {
			
			if(s.charAt(i)!=' ') c++;
			
		}
		
		System.out.println(c);
		
	}

}
