package esercizio25Penna;

import java.util.ArrayList;
import java.util.Scanner;
/*
	Definisci la classe Penna caratterizzata dagli attributi colore e inchiostro rimanente. La quantità
di inchiostro è un numero compreso fra 0 (inchiostro finito) e 100 (penna piena), i colori possibili
sono blue, rosso e nero. Quando crei un oggetto penna inizialmente dovrà essere piena. Si crei
nella classe Penna il metodo scrive() che consuma l’inchiostro un’unità alla volta in base al
numero di lettere che una persona vuole scrivere. La penna consuma un’unità di inchiostro ogni
20 lettere. Se il numero di lettere non è divisibile per 20, si considera l’intero e non si considera
il resto.
Crea una classe Esercizio25Main dove poni il metodo main. Il metodo main dovrà generare 3
penne di colore diverso, poi chiederà all’utente il colore della penna con cui vuole scrivere e
verrà generato casualmente il numero di lettere da scrivere (dovrà essere un numero fra 0 e
10000), dopodichè la penna scriverà le lettere. Alla fine comunicherà all’utente se la penna è
finita e se non è finita, quanto inchiostro è rimasto.
*/

public class MainPenna {

	public static void main(String[] args) throws InterruptedException {

		Scanner userInput = new Scanner(System.in);
		ArrayList<Penna> penne = new ArrayList<>();
		int index = 0;
		while (index != 2) {
			System.out.println("inserire colore della penna: ");
			String colore = userInput.next();

			penne.add(new Penna(colore));

			// Thread.sleep(1000);

			System.out.println("\n- 1 per aggiungere una penna di colore diverso \n- 2 per continuare  \n");
			index = userInput.nextInt();
			if (index == 2)
				break;

		}
		String frase;
		index = 1;
		while (index != 0) {
			System.out.println("inserire colore della penna con cui scrivere: ");
			String color = userInput.next();
			for (Penna penna : penne) {
				String colorCheck = penna.getColor();
				//
				if (color.endsWith(colorCheck)) {
					//
					//
					if (penna.getInk() > 0) {
						System.out.println("scrivi " + penna.getColor() + "\n");
						penna.inkOut();
						userInput.nextLine();
						while (penna.getInk() > 0) {
							System.out.println("scrivi qualcosa: ");
							frase = userInput.nextLine();
							if (frase.isEmpty() == false) {
								penna.write(frase);
							} else {
								System.out.println("non hai scritto niente");
							}
						}
					} else {
						System.out.println("inchiostro della penna " + penna.getColor() + " finito");
					}

				}
			}
			// Thread.sleep(3000);
			System.out.println("\n- 1 per scrivere con un'altra penna \n- 0 per chiudere  \n");
			index = userInput.nextInt();
			if (index == 0)
				break;
		}

	}

}
