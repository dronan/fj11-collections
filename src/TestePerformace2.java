import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class TestePerformace2 {
	public static void main(String[] args) {
		System.out.println("iniciando");
		long inicio = System.currentTimeMillis();
		
		List<Integer> teste = new LinkedList<Integer>();
		int total = 30000;
		
		for(int i = 0; i < total; i++){
			teste.add(i);
		}
		

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("tempo gasto:" +tempo);
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++){
			teste.get(i);
		}
		
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println(tempo);
		
		
	}

}
