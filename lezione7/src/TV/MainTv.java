package TV;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTv {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		ArrayList<Persona> persons = persons();
		Persona buyer = selectBuyer(persons);

	}

	public static ArrayList<Persona> persons() {

		Scanner userInput = new Scanner(System.in);
		ArrayList<Persona> persons = new ArrayList<>();
		int index = 1;
		while (index == 1) {
			System.out.println("inserire nome: ");
			String name = userInput.next();
			System.out.println("inserire sesso (M/F): ");
			String sex = userInput.next();
			System.out.println("inserire data di nascita (gg/mm/aaaa) ");
			String dateOfBirth = userInput.next();
			System.out.println("inserire professione: ");
			String profession = userInput.next();
			persons.add(new Persona(name, sex, dateOfBirth, profession));
			System.out.println("\n- 1 per inserire prossima persona \n- 2 per continuare  \n");
			index = userInput.nextInt();
			if (index == 2)
				break;
		}
		return persons;
	}

	public static Persona selectBuyer(ArrayList<Persona> persons) {
		Scanner userInput = new Scanner(System.in);
		Persona buyer = null;
		int index = 1;
		do {
			System.out.println("inserire il tuo nome: ");
			String name = userInput.next();
			for (Persona persona : persons) {
				String nameCheck = persona.getName();
				buyer = persona;
				// System.out.println(nameCheck);
				if (name.endsWith(nameCheck)) {
					System.out.println("\nI tuoi dati sono: ");
					persona.chiSei();

				}
			}
			System.out.println("\n- 1 cambiare nome \n- 0 per confermare  \n");
			index = userInput.nextInt();
			if (index == 0)
				break;
		} while (index == 1);

		return buyer;
	}

	public void sell(Persona person) {
		if (person.isAdult() == true) {
			Tv tv = initTv();
			assignTvOwner(tv, person);
		} else
			System.out.println("devi essere magiorenne per acquistare una TV");

	}

	public Tv initTv() {
		Scanner userIn = new Scanner(System.in);
		int chanelNum = userIn.nextInt();
		System.out.println("impostare canale 1-10: ");
		Tv tv = new Tv(chanelNum);
		return tv;
	}

	public void assignTvOwner(Tv tv, Persona owner) {
		tv.setOwner(owner);
	}

}
