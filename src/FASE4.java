import java.util.ArrayList;


public class FASE4 {

	public static void main(String[] args) {
		
		 ArrayList<Character> nom = new ArrayList<Character>(); 
		 
		  nom.add('M'); 
		  nom.add('I');
		  nom.add('G');
		  nom.add('U');
		  nom.add('E');
		  nom.add('L');
		  
		ArrayList<Character> cognom = new ArrayList<Character>(); 
			 
			  cognom.add('V'); 
			  cognom.add('A');
			  cognom.add('Z');
			  cognom.add('Q');
			  cognom.add('U');
			  cognom.add('E');
			  cognom.add('Z');
		
			  
		ArrayList<Character> FullName = new ArrayList<Character>(nom);
			  FullName.addAll(cognom);
			  
			  
			  System.out.print(FullName);
		
		

	}

}
