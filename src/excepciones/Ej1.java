package excepciones;

public class Ej1 {

	public static float[] convertir(String[]args) throws Exception {
		
		float[]convertido=new float[args.length];
		
		for(int i=0;i<args.length;i++) {
			
			
				
				if(args[i].charAt(0)<'0'||args[i].charAt(0)>'9') throw new Exception();
				
		
		
			
		convertido[i]=Float.parseFloat(args[i]);	
			
		
		
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
