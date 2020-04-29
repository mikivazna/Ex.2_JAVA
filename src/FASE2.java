

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
		  
		  
		
		for (char i=0;i<nom.size();i++){
		
		
		if (i=='A'||i=='E'||i=='I'||i=='O'||i=='U'||i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
			
			System.out.println("VOCAL");
			
		}
		
		
		else{
		
			System.out.println("CONSONANT");
			
		}
		
		if (i=='1'||i=='2'||i=='3'||i=='4'||i=='5'||i=='6'||i=='7'||i=='8'||i=='9'||i=='0'){
			
			System.out.println("Els noms de persones no contenen no contenen números");
		}
	}
	
	
}
	
	
}


	
	
	
	
	


