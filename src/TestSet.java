import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cargos = new HashSet<String>();
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretaria");
		cargos.add("Gerente");
		
		//for (String variavel : cargos) {
		//	System.out.println(variavel);
		//}
		
		Iterator<String> i = cargos.iterator();
		while (i.hasNext()) {
			String palavra = i.next();
			System.out.println(palavra);
			
		}
	}

}
