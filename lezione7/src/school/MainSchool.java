package school;

import java.util.Scanner;

public class MainSchool {

	public static void main(String[] args) {
		// instance of - to control affinity to a specific class
		// super.
		Scanner userIn = new Scanner(System.in);
		SchoolSystem school = new SchoolSystem("A.Manzoni", userIn);
		int ind = 9;
		while (ind != 0) {
			System.out.println("operazioni disponibili: " + "\n" + "1 - aggiungi un dipendente" + "\n"
					+ "2 - visualizza docenti" + "\n" + "3 - visualizza amministrativi" + "\n"
					+ "4 - vedere tutti i dipendenti" + "\n" + "5 - modifica i dati di un dipendnte" + "\n"
					+ "6 - licenzia un dipendente" + "\n" + "0 - uscire");
			ind = userIn.nextInt();
			switch (ind) {
			case 1:
				school.addPersonal();
				break;

			case 2:
				school.viewTeachers();
				break;
			case 3:
				school.viewAdministrative();
				break;
			case 4:
				school.viewAllPersonal();
				break;
			case 5:
				school.modifyPersonal();
				break;
			case 6:
				school.deletePersonal();
				break;
			case 0:
				break;
			}
		}
		userIn.close();
	}

}
