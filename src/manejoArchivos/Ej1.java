package manejoArchivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1 {

	public static void Lectura(String fileName) throws IOException{
		
		File f = new File(fileName);
		FileInputStream fis=new FileInputStream(f);
		DataInput fid=new DataInputStream(fis);
		String line;
		
		while((line=fid.readLine())!=null) {
			System.out.println(line);
		}
	
	}
	
	public static void af(String fileName, float[]sobreescribir) throws IOException{
		
		File f=new File(fileName);
		OutputStream fos=new FileOutputStream(f);
		PrintStream ps=new PrintStream(fos);
		String line="";
		for(int i=0;i<sobreescribir.length;i++) {
			
			line= line+sobreescribir[i]+"   ";
			
		}
		ps.close();
	}
	
	public static void include(String fileName) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor, introduce 3 líneas de texto");
		
		String[]args=new String[3];
		for(int i=0; i<3;i++) {
			args[i]=sc.nextLine();
		}
		
		File f=new File(fileName);
		OutputStream fos=new FileOutputStream(f, true);
		PrintStream ps=new PrintStream(fos);
		FileInputStream fis=new FileInputStream(f);
		DataInput fid=new DataInputStream(fis);
		//List<String>lineas=new ArrayList<String>();
		//String line;
		
		for(String s:args) {
			
			ps.println(s);
			
		}
	/*	while((line=fid.readLine())!=null) {
			
			lineas.add(line);
			
		}
		
		System.out.println(lineas);
		for(int j=0;j<3;j++) {
			
			lineas.add(args[j]);
		}
		
		for(String s:lineas) {
			
			ps.println(s);
		}*/
		
		ps.close();
		fis.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[]lel= {1.3f,1f,2.5f};
		
		try {
			Ej1.Lectura("alo.txt");
			Ej1.af("prueba.txt", lel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Ej1.include("alo.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
