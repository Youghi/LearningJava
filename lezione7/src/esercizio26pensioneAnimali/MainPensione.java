package esercizio26pensioneAnimali;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPensione {

//	Si vuole realizzare un programma per la gestione di una pensione per animali in cui bisogna
//	registrare non solo l’animale, ma anche i dati del proprietario, la data di arrivo e quella di
//	partenza dell’animale. Il programma deve permettere di aggiungere un animale, modificare i
//	suoi dati (inclusi quelli del proprietario) e cancellare un animale.

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("premere:" + "\n" + "1 per aggiungere una scheda dell'ospite" + "\n"
				+ "2 per modificare una scheda dell'ospite" + "\n" + "3 cancellare una scheda dell'ospite");
		int ind = userIn.nextInt();
		switch (ind) {
		case 1:
			// addForm();
			break;
		case 2:
			// modifyForm();
			break;
		case 3:
			// removeForm();
			break;
		}

	}

	public static ArrayList<Form> addForm(ArrayList<Form> guestForms) {
		ArrayList<Form> forms = guestForms;
		// operations for adding a form:
		// 1 ask code
		// 2 create animal and use method to compile it
		// 3 create owner and use method to compile it
		// 4 create schedule and use method to compile it
		// guestForms.add(new Form(code, animal, owner, schedule));
		return forms;
	}

	public static ArrayList<Form> modifyForm(ArrayList<Form> guestForms) {
		ArrayList<Form> forms = guestForms;
		// operations for modifying a form:
		// 1 ask code
		// 2 loop for finding that form
		// 3 switch case for selecting to modify animal, owner, schedule <<< methods to
		// modify them

		return forms;
	}

}

