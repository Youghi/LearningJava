package esercizio29School;

import java.util.Scanner;

public class Teacher extends Personal {

	private String subject  = "sconosciuto";
	private String asignedClass  = "sconosciuto";
Scanner userIn;
	
	public Teacher(Scanner userIn) {
		this.userIn = userIn;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAsignedClass() {
		return asignedClass;
	}

	public void setAsignedClass(String asignedClass) {
		this.asignedClass = asignedClass;
	}

	@Override
	public void gatherData() {
		super.gatherData();
		
		System.out.println("inserire materia insegnata:");
		this.subject = userIn.next();
		System.out.println("inserire classe assegnata:");
		this.asignedClass = userIn.next();
	}
	
	@Override
	public void getPersonal() {
		super.getPersonal();
		System.out.println("materia insegnata: " + this.subject + "\n" + "classe assegnata: " + this.asignedClass);
	}

	@Override
	public void modifyData() {
		super.modifyData();
		System.out.println("1 - modificare materia insegnata" + "\n" + "2 - modificare classe assegnata" + "\n" + "3 - completare");
		int ind = userIn.nextInt();
		switch (ind) {
		case 1:
			System.out.println("materia insegnata da modificare: " + this.subject + "\n" + "inserire nuova materia insegnata: ");
			this.subject = userIn.next();
			break;

		case 2:
			System.out.println("classe assegnata da modificare: " + this.asignedClass + "\n" + "inserire nuova classe assegnata: ");
			this.asignedClass = userIn.next();
			break;

		case 3:
			break;
		}
	}
}
