import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {

	
	
	
	public static void main(String[] args) {
//		List<String> lista = new ArrayList<String>();
//		lista.add("Manoel");
//		lista.add("Joaquim");
//		lista.add("maria");
//		
//		System.out.println(lista);
//		
//		Collections.sort(lista);
//		
//		System.out.println(lista);
	
		List inteiros = new ArrayList();
		
		for (int x = 1; x <= 1000; x++){
			inteiros.add(x);
		}
		
		Collections.sort(inteiros);
		Collections.reverse(inteiros);
		System.out.println(inteiros);
		
	
	}

}
