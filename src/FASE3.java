import java.util.*;

public class FASE3 {

	public static void main(String[] args) {
		
		HashMap<String, Letras> nombre = new HashMap<String, Letras>();
		
		nombre.put("1", new Letras("M"));
		
		nombre.put("2", new Letras("I"));
		
		nombre.put("3", new Letras("G"));
		
		nombre.put("4", new Letras("U"));
		
		nombre.put("5", new Letras("E"));
		
		nombre.put("6", new Letras("L"));
		
		System.out.println(nombre);
		
		
	}
	
}
	


class Letras{
	
	public Letras(String n){
		
		Letras=n;
		
		repeticion=1;
		
	}
	
public String toString(){
		
		return "[La letra " + Letras + " se repite " + repeticion+ " vez]";
	
}
		
		private String Letras;

		private int repeticion;
	
		}

