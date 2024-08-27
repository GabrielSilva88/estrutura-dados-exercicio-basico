
package ListaBasicoCompleto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListaNumero {

	public static void main(String[] args) {
		Random r = new Random();

		/*
		 * 1) Crie uma Lista com vinte números aleatórios.
		 */
		List<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int valor = r.nextInt(20) + 1;
			numeros.add(valor);
		}

		/*
		 * 2) Adicione o número 11 à Lista criada no exercício anterior.
		 */

		numeros.add(11);

		/*
		 * 3) Remova o número na 5ª posição da Lista.
		 */
		numeros.remove(4);

		/*
		 * 4) Concatene a Lista atual com uma nova Lista contendo os números de 12 a 15.
		 */

		List<Integer> newLista = new ArrayList<Integer>();
		newLista.add(12);
		newLista.add(13);
		newLista.add(14);
		newLista.add(15);

		numeros.addAll(newLista);

		/*
		 * 5) Encontre o comprimento da Lista resultante.
		 */
			System.out.println(numeros.size() );
		/*
		 * 6) Verifique se o número 8 está presente na Lista.
		 */
			System.out.println(numeros.contains(8));
		/*
		 * 7) Inverta a ordem dos elementos na Lista.
		 */
			Collections.reverse(numeros);
		/*
		 * 8) Remova todos os números pares da Lista.
		 */
			List<Integer> impar = new ArrayList<Integer>();
			
			for (Integer integer : numeros) {
				if(integer % 2 != 0) {
					numeros.remove(integer);
				}
			}
			
			numeros.clear();
			numeros.addAll(impar);
			System.out.println(numeros);
		/*
		 * 9) Substitua o valor da 3ª posição por 30.
		 */
			numeros.set(2, 30);
		/*
		 * 10) Ordene a Lista de forma crescente.
		 */
		
		Collections.sort(numeros);
		

	}
}
