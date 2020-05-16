import java.util.*;

public class FASE3<E>
{
       public static void main(String[] args) 
       {
    	   
  		 ArrayList<Character> nom = new ArrayList<Character>(); 
		 
		  nom.add('M'); 
		  nom.add('I');
		  nom.add('G');
		  nom.add('U');
		  nom.add('E');
		  nom.add('L');
		  
           Map<Character, Integer> unique = new LinkedHashMap<Character, Integer>();
           for (Character instrumento:nom) {
               if(unique.get(instrumento) == null)
                   unique.put(instrumento, 1);
               else
                   unique.put(instrumento, unique.get(instrumento) + 1);
           }
           String uniqueCharacter = join(unique.keySet(), ", ");
           List<Integer> value = new ArrayList<Integer>(unique.values());

           System.out.println("Nombre = " + uniqueCharacter);
           System.out.println("Repeticiones de las letras = " + value);

       }

       public static String join(Set<Character> set, String delimiter) {
           StringBuffer buffer = new StringBuffer();
           Iterator<Character> iter = set.iterator();
           while (iter.hasNext()) {
               buffer.append(iter.next());
               if (iter.hasNext()) {
                   buffer.append(delimiter);
               }
           }
           return buffer.toString();
       }
}

