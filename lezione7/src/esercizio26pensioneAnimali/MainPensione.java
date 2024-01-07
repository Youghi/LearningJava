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
		ArrayList<Form> guestForms = new ArrayList<>();
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
		userIn.close();
	}

	public static ArrayList<Form> addForm(ArrayList<Form> guestForms) {
		Scanner userIn = new Scanner(System.in);
		ArrayList<Form> forms = guestForms;
		// operations for adding a form:
		// 1 ask code
		// 2 create animal and use method to compile it
		// 3 create owner and use method to compile it
		// 4 create schedule and use method to compile it
		System.out.println("inserire codice cliente: ");
		int code = userIn.nextInt();

		System.out.println("ora inserire dati dell'animale: " + "\n");
		Animal animal = animalCreator();

		System.out.println("ora inserire dati del proprietario: " + "\n");
		Owner owner = ownerCreator();

		System.out.println("ora inserire i dati gestionali: " + "n");
		Schedule schedule = scheduleCreator();

		guestForms.add(new Form(code, animal, owner, schedule));
		userIn.close();
		return forms;
	}

	public static ArrayList<Form> modifyForm(ArrayList<Form> guestForms) {
		Scanner userIn = new Scanner(System.in);
		ArrayList<Form> forms = guestForms;
		// operations for modifying a form:
		// 1 ask code
		// 2 loop for finding that form
		// 3 switch case for selecting to modify animal, owner, schedule <<< methods to
		// modify them
		System.out.println("inserire codice cliente da modificare: ");
		int code = userIn.nextInt();
		for (Form form : forms) {
			if (form.getCode() == code) {
				System.out.println("premere: " + "\n" + "1 per modificare dati logistici" + "\n"
						+ "2 per modificare dati proprietario" + "\n" + "3 per modificare dati animale" + "\n");
				int ind = userIn.nextInt();
				switch (ind) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;

				default:
					break;
				}
			}
		}
		userIn.close();
		return forms;
	}

	public static ArrayList<Form> removeForm(ArrayList<Form> guestForms) {
		ArrayList<Form> forms = guestForms;
		// operations for modifying a form:
		// 1 ask code
		// 2 loop with index for finding that form
		// 3 remove form based on index
		return forms;
	}

	public static Owner ownerCreator() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("inserire nome: ");
		String nameOwner = userIn.next();
		System.out.println("inserire sesso (M/F): ");
		String sex = userIn.next();
		System.out.println("inserire data di nascita (gg/mm/aaaa) ");
		String dateOfBirth = userIn.next();
		System.out.println("inserire professione: ");
		String profession = userIn.next();
		Owner owner = new Owner(nameOwner, sex, dateOfBirth, profession);
		userIn.close();
		return owner;
	}

	public static Animal animalCreator() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("tipo animale?: ");
		String type = userIn.next();
		System.out.println("nome animale?: ");
		String name = userIn.next();
		System.out.println("altezza di " + name + "?: ");
		double height = userIn.nextDouble();
		System.out.println("peso di " + name + "?: ");
		double weight = userIn.nextDouble();
		System.out.println("cibo preferito di " + name + "?");
		String favFood = userIn.next();
		Animal animal = new Animal(type, name, height, weight, favFood);
		userIn.close();
		return animal;
	}

	public static Schedule scheduleCreator() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("ora e data di arrivo (hh:mm gg/mm/aaaa): ");
		String arrival = userIn.next();
		System.out.println("ora e data di partenza (hh:mm gg/mm/aaaa) : ");
		String departure = userIn.next();
		Schedule schedule = new Schedule(arrival, departure);
		userIn.close();
		return schedule;
	}


	public static Owner ownerModifyer(Owner owner) {

	}

	public static Animal animalModifyer() {

	}

	public static Schedule scheduleModifyer() {

	}

}

