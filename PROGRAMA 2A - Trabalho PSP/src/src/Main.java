package src;
import Models.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Complexidade ciclomática -> 3 ( desconsiderando a função de ordenação )
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer numero_times = sc.nextInt();
		Time[] times = new Time[numero_times];
		List<Time> auxiliar = new ArrayList<Time>();
		
		for (Integer i=0; i<numero_times; i++) {
			times[i] = new Time();
			times[i].set_inscricao(i+1);
		}	
		for (int i=0; i<numero_times*(numero_times-1)/2; i++) {
			int timeA = sc.nextInt() - 1;
			int pontosA = sc.nextInt();
			int timeB = sc.nextInt() - 1;
			int pontosB = sc.nextInt();
			if (pontosA > pontosB) {
				times[timeA].set_pontos(times[timeA].get_pontos()+2);
				times[timeB].set_pontos(times[timeB].get_pontos()+1);
			}
			else{
				times[timeB].set_pontos(times[timeB].get_pontos()+2);
				times[timeA].set_pontos(times[timeA].get_pontos()+1);	
			}
			times[timeA].set_feitos(times[timeA].get_feitos() + pontosA);
			times[timeA].set_tomados(times[timeA].get_tomados() + pontosA);
			times[timeB].set_feitos(times[timeB].get_feitos() + pontosB);
			times[timeB].set_tomados(times[timeB].get_tomados() + pontosB);
		}
		Collections.addAll(auxiliar, times);
		Collections.sort(auxiliar, new Comparator<Time>() {
			@Override
			public int compare(Time A, Time B) {
				if (A.get_pontos() < B.get_pontos()) {
					return 1;
				}
				if (A.get_pontos() > B.get_pontos()) {
					return -1;
				}
				
				if (A.get_cesta_average() < B.get_cesta_average()) {
					return 1;
				}
				if (A.get_cesta_average() > B.get_cesta_average()) {
					return -1;
				}
				
				if (A.get_inscricao() < B.get_inscricao()) {
					return -1;
				}
				else return 1;
			}
		});
		
		boolean is_first = true;
		for (Time x : auxiliar) {
			if (!is_first) {
				System.out.print(" ");
			}
			is_first = false;
			System.out.print(x.get_inscricao());
		}
		System.out.print("\n");
		sc.close();
	}
}
