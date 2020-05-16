
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class FASE2 {
	public static void main(String[] args) {
		 
		 ArrayList<Character> nom = new ArrayList<Character>(); 
		 
		  nom.add('M'); 
		  nom.add('I');
		  nom.add('G');
		  nom.add('U');
		  nom.add('E');
		  nom.add('L');
		  
		for (char instrumento:nom){
			
		if	(instrumento=='1'||instrumento=='2'||instrumento=='3'||instrumento=='4'||instrumento=='5'||instrumento=='6'||instrumento=='7'||instrumento=='8'||instrumento=='9'||instrumento=='0'){
			
			System.out.println("Els noms de persones no contenen no contenen números");
			
		}
		
		
		else if (instrumento=='A'||instrumento=='E'||instrumento=='I'||instrumento=='O'||instrumento=='U'||instrumento=='a'||instrumento=='e'||instrumento=='i'||instrumento=='o'||instrumento=='u'){
			
			System.out.println("VOCAL");
			
		}
		
		
		else{
		
			System.out.println("CONSONANT");
			
		}
		
		
	}
	
	
}
	
	
}


	
	
	
	
	


