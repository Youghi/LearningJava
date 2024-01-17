package school;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem {
	private ArrayList<Personal> personal = new ArrayList<Personal>();
	private String name = "sconosciuto";
	Scanner userIn;

	public SchoolSystem(String name, Scanner UserIn) {
		this.userIn = UserIn;
	}

	public ArrayList<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPersonal() {
		System.out
				.println("premere" + "\n" + "- D per inserire un docente" + "\n" + "- A per inserire un amministativo");
		Personal persona = null;
		String answ = userIn.next();
		if (answ.equalsIgnoreCase("D")) {
			persona = new Teacher(userIn);
			persona.gatherData();

		} else if (answ.equalsIgnoreCase("A")) {
			persona = new Administrative(userIn);
			persona.gatherData();
		} else {
			System.out.println("input non valido!");
			return;
		}
		personal.add(persona);
	}

	public void viewTeachers() {

		System.out.println("***** Docenti *****");
		for (Personal personal : personal) {
			if (personal instanceof Teacher) {
				personal.getPersonal();
				System.out.println("_______________");
			}
		}
	}

	public void viewAdministrative() {
		System.out.println("***** Amministrativi *****");
		for (Personal personal : personal) {
			if (personal instanceof Administrative) {
				personal.getPersonal();
				System.out.println("_______________");
			}
		}
	}

	public void viewAllPersonal() {
		for (Personal personal : personal) {
			if (personal instanceof Administrative) {
				System.out.println("-- Amministrativo");
				personal.getPersonal();
				System.out.println("_______________");
			} else {
				System.out.println("-- Docente");
				personal.getPersonal();
				System.out.println("_______________");
			}
		}
	}

	public void modifyPersonal() {
		System.out.println("D - Per modificare Docenti" + "\n" + "A -  Per modificare Amministrativi");
		String answ = userIn.next();
		if (answ.equalsIgnoreCase("D")) {
			for (int i = 0; i < personal.size(); i++) {
				if (personal.get(i) instanceof Teacher) {
					System.out.println(i + ":");
					personal.get(i).getPersonal();
				}
			}
			System.out.println("inserire numero docente da modificare:");
			int ind = userIn.nextInt();
			personal.get(ind).modifyData();

		} else if (answ.equalsIgnoreCase("A")) {

			
		} else {
			System.out.println("input non valido!");
			return;
		}
	}

	public void deletePersonal() {
		for (int i = 0; i < personal.size(); i++) {
			System.out.println(i + ":" + "\n" + personal.get(i) + "\n" + "_____________");
		}
		System.out.println("inserire numero dipendente da licenziare");
		int ind = userIn.nextInt();
		personal.remove(ind);
	}
}
