package esercizio26pensioneAnimali;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPensione {
	
	static MainPensione pensione = new MainPensione();
	

//	Si vuole realizzare un programma per la gestione di una pensione per animali in cui bisogna
//	registrare non solo l’animale, ma anche i dati del proprietario, la data di arrivo e quella di
//	partenza dell’animale. Il programma deve permettere di aggiungere un animale, modificare i
//	suoi dati (inclusi quelli del proprietario) e cancellare un animale.

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		ArrayList<Form> guestForms = new ArrayList<>();
		int ind = 9;
		while (ind !=0) {
			//userIn.nextLine();
			System.out.println("\n" + "\n" + "premere:" + "\n" + "1 per aggiungere una scheda dell'ospite" + "\n"
					+ "2 per modificare una scheda dell'ospite" + "\n" + "3 cancellare una scheda dell'ospite" + "\n"  + "4 mostrare l'elenco di tutte le schede" + "\n" + "0 per uscire" + "\n");
			ind = userIn.nextInt();
			switch (ind) {
			case 1:
				// addForm();
				guestForms = pensione.addForm(guestForms, userIn);
				break;
			case 2:
				// modifyForm();
				guestForms = pensione.modifyForm(guestForms, userIn);
				break;
			case 3:
				// removeForm();
				guestForms = pensione.removeForm(guestForms, userIn);
				break;
			case 4:
				for (Form form : guestForms) {
					form.getForm();
					System.out.println("_____________________________");
				}
				break;
			}
			
		}
		userIn.close();
	}

	public ArrayList<Form> addForm(ArrayList<Form> guestForms, Scanner userIn) {
		ArrayList<Form> forms = guestForms;
		// operations for adding a form:
		// 1 ask code
		// 2 create animal and use method to compile it
		// 3 create owner and use method to compile it
		// 4 create schedule and use method to compile it
		System.out.println("inserire codice cliente: ");
		int code = userIn.nextInt();

		System.out.println("\n" + "ora inserire dati dell'animale: " + "\n");
		userIn.nextLine();
		Animal animal = pensione.animalCreator(userIn);

		System.out.println("\n" + "ora inserire dati del proprietario: " + "\n");
		userIn.nextLine();
		Owner owner = pensione.ownerCreator(userIn);

		System.out.println("\n" + "ora inserire i dati gestionali: " + "\n");
		userIn.nextLine();
		Schedule schedule = pensione.scheduleCreator(userIn);

		guestForms.add(new Form(code, animal, owner, schedule));
		return forms;
	}

	public ArrayList<Form> modifyForm(ArrayList<Form> guestForms, Scanner userIn) {
		ArrayList<Form> forms = guestForms;
		System.out.println("\n" + "elenco schede:" + "\n");
		for (Form form : forms) {
			form.getForm();
			System.out.println("_____________________________");
		}
		// operations for modifying a form:
		// 1 ask code
		// 2 loop for finding that form
		// 3 switch case for selecting to modify animal, owner, schedule <<< methods to
		// modify them
		System.out.println("inserire codice cliente da modificare: ");
		int code = userIn.nextInt();
		for (Form form : forms) {
			if (form.getCode() == code) {
				System.out.println("\n" + "scheda selizionata: " + "\n");
				form.getForm();
				System.out.println("\n" + "premere: " + "\n" + "1 per modificare dati logistici" + "\n"
						+ "2 per modificare dati proprietario" + "\n" + "3 per modificare dati animale" + "\n");
				int ind = userIn.nextInt();
				switch (ind) {
				case 1:
					form.setSchedule(scheduleModifyer(form.getSchedule(), userIn));
					break;
				case 2:
					form.setOwner(ownerModifyer(form.getOwner(), userIn));
					break;
				case 3:
					form.setAnimal(animalModifyer(form.getAnimal(), userIn));
					break;

				default:
					break;
				}
			}
		}
		return forms;
	}

	public ArrayList<Form> removeForm(ArrayList<Form> guestForms, Scanner userIn) {
		ArrayList<Form> forms = guestForms;
		// operations for modifying a form:
		// 1 ask code
		// 2 loop with index for finding that form
		// 3 remove form based on index
		System.out.println("\n" + "elenco schede:" + "\n");
		for (Form form : forms) {
			form.getForm();
		}
		System.out.println("\n" + "inserire codice scheda da rimuovere:");
		int code = userIn.nextInt();
		int ind = indexFinder(guestForms, code);
		guestForms.remove(ind);
		return forms;
	}

	public Owner ownerCreator(Scanner userIn) {
		System.out.println("inserire nome: ");
		String nameOwner = userIn.nextLine();
		System.out.println("inserire sesso (M/F): ");
		String sex = userIn.nextLine();
		System.out.println("inserire data di nascita (gg/mm/aaaa) ");
		String dateOfBirth = userIn.nextLine();
		System.out.println("inserire professione: ");
		String profession = userIn.nextLine();
		Owner owner = new Owner(nameOwner, sex, dateOfBirth, profession);
		return owner;
	}

	public Animal animalCreator(Scanner userIn) {
		System.out.println("tipo animale?: ");
		String type = userIn.nextLine();
		System.out.println("nome animale?: ");
		String name = userIn.nextLine();
		System.out.println("altezza di " + name + "?: ");
		double height = userIn.nextDouble();
		System.out.println("peso di " + name + "?: ");
		double weight = userIn.nextDouble();
		userIn.nextLine();
		System.out.println("cibo preferito di " + name + "?");
		String favFood = userIn.nextLine();
		Animal animal = new Animal(type, name, height, weight, favFood);
		return animal;
	}

	public Schedule scheduleCreator(Scanner userIn) {
		System.out.println("ora e data di arrivo (hh:mm gg/mm/aaaa): ");
		String arrival = userIn.nextLine();
		System.out.println("ora e data di partenza (hh:mm gg/mm/aaaa) : ");
		String departure = userIn.nextLine();
		Schedule schedule = new Schedule(arrival, departure);
		return schedule;
	}


	public static Owner ownerModifyer(Owner owner, Scanner userIn) {
		Owner newOwner = owner;
		int ind = 9;
		while (ind !=0) {
			System.out.println("premere: " + "\n" + "1 per modificare nome" + "\n" + "2 per modificare sesso" + "\n"
					+ "3 per modificare data di nascita" + "\n" + "4 per modificare professione" + "\n" + "0 per uscire");
			ind = userIn.nextInt();
			switch (ind) {
			case 1:
				userIn.nextLine();
				System.out.println("Nome da modificare:" + "\n" + owner.getName() + "\n" + "inserire nuovo nome:");
				String name = userIn.nextLine();
				newOwner.setName(name);
				break;
			case 2:
				userIn.nextLine();
				System.out.println("Sesso da modificare:" + "\n" + owner.getSexChecked() + "\n" + "inserire nuovo sesso:");
				String sex = userIn.nextLine();
				newOwner.setSex(sex);
				break;
			case 3:
				userIn.nextLine();
				System.out.println("Data di nascita da modificare:" + "\n" + owner.getDateOfBirth() + "\n"
						+ "inserire nuova data di nascita:");
				String dateOfBirth = userIn.nextLine();
				newOwner.setDateOfBirth(dateOfBirth);
				break;
			case 4:
				userIn.nextLine();
				System.out.println("Professione da modificare:" + "\n" + owner.getProfession() + "\n"
						+ "inserire nuova professione:");
				String profession = userIn.nextLine();
				newOwner.setProfession(profession);
				break;
				
			}
			
		}
		return newOwner;
	}

	public static Animal animalModifyer(Animal animal, Scanner userIn) {
		Animal newAnimal = animal;
		int ind = 9;
		while (ind !=0) {
			System.out.println("premere: " + "\n" + "1 per modificare tipo animale" + "\n" + "2 per modificare nome" + "\n"
					+ "3 per modificare altezza" + "\n" + "4 per modificare peso" + "\n" + "5 per modificare cibo preferito"
					+ "\n" + "0 per uscire");
			ind = userIn.nextInt();
			switch (ind) {
			case 1:
				userIn.nextLine();
				System.out.println("Tipo dell'animale da modificare da modificare:" + "\n" + animal.getType() + "\n" + "inserire nuovo tipo dell'animale:");
				String type = userIn.nextLine();
				newAnimal.setType(type);
				break;
			case 2:
				userIn.nextLine();
				System.out.println("Nome dell'animale da modificare da modificare:" + "\n" + animal.getName() + "\n" + "inserire nuovo nome dell'animale:");
				String name = userIn.nextLine();
				newAnimal.setName(name);
				break;
			case 3:
				System.out.println("Altezza dell'animale da modificare da modificare:" + "\n" + animal.getHeight() + "\n" + "inserire nuova altezza dell'animale:");
				double height = userIn.nextDouble();
				newAnimal.setHeight(height);
				break;
			case 4:
				System.out.println("Peso dell'animale da modificare da modificare:" + "\n" + animal.getWeight() + "\n" + "inserire nuovo peso dell'animale:");
				double weight = userIn.nextDouble();
				newAnimal.setWeight(weight);
				break;
			case 5:
				userIn.nextLine();
				System.out.println("Cibo preferito dell'animale da modificare da modificare:" + "\n" + animal.getFavFood() + "\n" + "inserire nuovo cibo preferito dell'animale:");
				String favFood = userIn.nextLine();
				newAnimal.setFavFood(favFood);
				break;
				
			}
			
		}

		return newAnimal;
	}

	public static Schedule scheduleModifyer(Schedule schedule, Scanner userIn) {
		Schedule newSchedule = schedule;
		int ind = 9;
		while (ind !=0) {
			System.out.println("premere: " + "\n" + "1 per modificare arrivo" + "\n" + "2 per modificare partenza" + "\n" + "0 per uscire");
			ind = userIn.nextInt();
			switch (ind) {
			case 1:
				userIn.nextLine();
				System.out.println("orario di arrivo da modificare:" + "\n" + schedule.getArrival() + "\n" + "inserire un nuovo orario di arrivo:");
				String arrival = userIn.nextLine();
				newSchedule.setArrival(arrival);
				break;
			case 2:
				userIn.nextLine();
				System.out.println("orario di partenza da modificare:" + "\n" + schedule.getDeparture() + "\n" + "inserire un nuovo orario di partenza:");
				String departure = userIn.nextLine();
				newSchedule.setDeparture(departure);
				break;
			}
			
		}
		return newSchedule;
	}
	
	public static int indexFinder(ArrayList<Form> guestForms, int code) {
		int ind = 0;
		for (int i = 0; i <= guestForms.size()-1; i++) {
				Form form = guestForms.get(i);
			if (code == form.getCode()) {
				ind = i;
			}
		}
		return ind;
	}

}

