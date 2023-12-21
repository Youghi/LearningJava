package TV;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTv {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		ArrayList<Persona> persons = persons();
		Persona buyer = selectBuyer(persons);
		Tv tv = sell(buyer);
		System.out.println("\n-1 per usare tv \n-2 per uscire");
		int index = userInput.nextInt();
		if (index == 1) {
			int button = 0;
			System.out.println(
					"canali 1-10 \n 11On/Off \n 12 volume su \n 13 volume giu \n 14 luminosita su \n 15 luminosita giu \n 16 per uscire");
			while (button != 16) {
				button = userInput.nextInt();
				tv.remoteController(button);
			}
		}

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
		while (index == 1) {
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
		}

		return buyer;
	}

	public static Tv sell(Persona person) {
		if (person.isAdult() == true) {
			System.out.println("complimenti, hai acquistato una tv");
			Tv tv = initTv();
			assignTvOwner(tv, person);
			return tv;
		} else {
			System.out.println("devi essere magiorenne per acquistare una TV");
		}
		return null;

	}

	public static Tv initTv() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("impostare canale 1-10: ");
		int chanelNum = userIn.nextInt();
		Tv tv = new Tv(chanelNum);
		return tv;
	}

	public static void assignTvOwner(Tv tv, Persona owner) {
		tv.setOwner(owner);
	}

}
