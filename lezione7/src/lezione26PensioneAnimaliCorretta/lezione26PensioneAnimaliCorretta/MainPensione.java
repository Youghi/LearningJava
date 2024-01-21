package lezione26PensioneAnimaliCorretta.lezione26PensioneAnimaliCorretta;

import java.util.Scanner;

import esercizio26pensioneAnimali.Form;

public class MainPensione {

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		Pensione pensione = new Pensione(userIn);
		int ind = 9;
		while (ind != 0) {
		
			System.out.println("\n" + "\n" + "premere:" + "\n" + "1 per aggiungere una scheda di soggiorno" + "\n"
					+ "2 per modificare una scheda dell'ospite" + "\n" + "3 cancellare una scheda dell'ospite" + "\n"
					+ "4 mostrare l'elenco di tutte le schede" + "\n"
					+ "5 mostrare l'elenco di tutti gli animali registrati" + "\n"
					+ "6 mostrare l'elenco di tutti i clienti registrati" + "\n" + "0 per uscire" + "\n");
			ind = userIn.nextInt();
			
			switch (ind) {
			case 1:
				pensione.addForm();
				break;
				
			case 2:
				pensione.modifyForm();
				break;
				
			case 3:
				pensione.removeForm();
				break;
				
			case 4:
				pensione.getForms();
				break;
				
			case 5:
				pensione.getAnimals();
				break;
				
			case 6:
				pensione.getOwners();
				break;

			case 0:
				break;
			}

		}

	}

}
