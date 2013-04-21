import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class TestePerformace {
	public static void main(String[] args) {
		System.out.println("iniciando");
		long inicio = System.currentTimeMillis();
		
		Collection<Integer> teste = new HashSet<Integer>();
		int total = 30000;
		
		for(int i = 0; i < total; i++){
			teste.add(i);
		}
		

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("tempo gasto:" +tempo);
		
		System.out.println("iniciando");
		inicio = System.currentTimeMillis();
		
		
		for (int i = 0; i < total; i++){
			teste.contains(i);
		}
		
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("tempo gasto:" +tempo);
		
	}

}
